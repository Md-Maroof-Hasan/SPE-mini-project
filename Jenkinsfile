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
                script {
                    // Checkout code from GitHub
                    git branch: 'main', url: "${GITHUB_REPO_URL}"
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    // Build Docker image
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
                script {
                    ansiblePlaybook(
                        playbook: 'deploy.yml',
                        inventory: 'inventory'
                    )
                }
            }
        }

    }
    post {
        success {
            emailext(
                subject: "SUCCESS: ${JOB_NAME} #${BUILD_NUMBER}",
                body: "Build succeeded.\n\nJob: ${JOB_NAME}\nBuild: ${BUILD_NUMBER}\n${BUILD_URL}",
                to: "md.maroofnzhs@gmail.com"
            )
        }

        failure {
            emailext(
                subject: "FAILED: ${JOB_NAME} #${BUILD_NUMBER}",
                body: "Build failed.\n\nJob: ${JOB_NAME}\nBuild: ${BUILD_NUMBER}\n${BUILD_URL}",
                to: "md.maroofnzhs@gmail.com"
            )
        }
    }
}
