pipeline {
    agent any

    triggers {
        githubPush()
    }

    environment {
        DOCKER_IMAGE_NAME = 'spe-calculator'
        GITHUB_REPO_URL = 'https://github.com/Md-Maroof-Hasan/SPE-mini-project.git'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main', url: "${GITHUB_REPO_URL}"
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test2'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    docker.build("${DOCKER_IMAGE_NAME}", ".")
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                script {
                    docker.withRegistry('', 'docker-hub-cred') {
                        sh 'docker tag spe-calculator mdmaroof05/spe-calculator:latest'
                        sh 'docker push mdmaroof05/spe-calculator'
                    }
                }
            }
        }

        stage('Run Ansible Playbook') {
            steps {
                ansiblePlaybook(
                    playbook: 'deploy.yml',
                    inventory: 'inventory'
                )
            }
        }
    }
    post {
        always {
            emailext(
                subject: "Jenkins Pipeline Notification: ${JOB_NAME} #${BUILD_NUMBER}",
                body: """
    Build Status: ${currentBuild.currentResult}

    Job: ${JOB_NAME}
    Build: ${BUILD_NUMBER}
    URL: ${BUILD_URL}
    """,
                to: "md.maroofnzhs@gmail.com"
            )
        }
    }
}
