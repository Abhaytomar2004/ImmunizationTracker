pipeline {
    agent any
    tools {
        maven 'Maven 3.9.9'
        jdk 'JDK-21'
    }
    environment {
        DOCKER_CONFIG = "${env.WORKSPACE}/.docker"
        MINIKUBE_HOME = 'C:/minikube'
    }
    stages {
        stage('Checkout') {
            steps {
                checkout([$class: 'GitSCM', 
                    branches: [[name: 'JAV-01']],
                    userRemoteConfigs: [[url: 'https://github.com/Abhaytomar2004/ImmunizationTracker.git']]
                ])
            }
        }

        stage('Build') {
            steps {
                dir('ImmunizationTracker') {
                    bat 'mvn clean package -DskipTests'
                }
            }
        }

       stage('Docker Build & Push') {
    steps {
        dir('ImmunizationTracker') {
            script {
                bat "docker build -t arnold21/immunizationtracker:${env.BUILD_ID} ."
                withCredentials([usernamePassword(
                    credentialsId: 'docker-hub-credentials',
                    usernameVariable: 'DOCKER_USER',
                    passwordVariable: 'DOCKER_TOKEN'
                )]) {
                    bat """
                        echo %DOCKER_TOKEN% | docker login -u %DOCKER_USER% --password-stdin
                    """
                }

                bat "docker push arnold21/immunizationtracker:${env.BUILD_ID}"
            }
        }
    }
}
        stage('Deploy to Minikube') {
            steps {
                script {
                    bat 'minikube status || minikube start --driver=docker --force'
                    dir('ImmunizationTracker/k8s') {
                        bat 'kubectl apply -f mysql-pv.yaml'
                        bat 'kubectl apply -f mysql-deployment.yaml'
                        bat 'kubectl apply -f deployment.yaml'
                        bat 'kubectl apply -f service.yaml'
                    }
                }
            }
        }
    }
    post {
        always {
            cleanWs()
        }
    }
}
