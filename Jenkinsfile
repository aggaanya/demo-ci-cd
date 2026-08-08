pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t aanyaagg/employee-api:v1 .'
            }
        }

        stage('Push Docker Image') {
            steps {
                bat 'docker push aanyaagg/employee-api:v1'
            }
        }

        stage('Run Docker Container') {
            steps {
                bat '''
                docker stop employee-container 2>nul
                docker rm employee-container 2>nul
                docker run -d -p 8081:8080 --name employee-container aanyaagg/employee-api:v1
                '''
            }
        }
    }
}