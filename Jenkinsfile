pipeline {
    agent any

    stages {

        stage('Clone Repository') {
            steps {
                git 'https://github.com/ashwardha/java-cicd-calculator-cicd.git'
            }
        }

        stage('Build Application') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t ashwardha/java-cicd-app:latest .'
            }
        }

        stage('Push Docker Image') {
            steps {
                sh 'docker push ashwardha/java-cicd-app:latest'
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh 'kubectl set image deployment/java-cicd-app java-cicd-app=ashwardha/java-cicd-app:latest'
            }
        }

    }
}
