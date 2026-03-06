pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "spe-calculator"
        DOCKERHUB_IMAGE = "mdmaroof05/spe-calculator"
    }

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/Md-Maroof-Hasan/SPE-mini-project.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $DOCKER_IMAGE .'
            }
        }

        stage('Tag Image') {
            steps {
                sh 'docker tag $DOCKER_IMAGE $DOCKERHUB_IMAGE'
            }
        }

        stage('Push Image') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'dockerhub-cred', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
                    sh 'echo $PASS | docker login -u $USER --password-stdin'
                    sh 'docker push $DOCKERHUB_IMAGE'
                }
            }
        }

    }
}
