pipeline {
    agent any

    tools {
        maven 'M3'  // Doit correspondre à un Maven pré-configuré dans Jenkins
        jdk 'JDK17' // Doit correspondre à un JDK configuré dans Jenkins
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Build Docker Image') {
            when {
                branch 'main'
            }
            steps {
                script {
                    docker.build("mon-project-spring:${env.BUILD_ID}")
                }
            }
        }

        stage('Deploy') {
            when {
                branch 'main'
            }
            steps {
                sh 'docker-compose up -d'
            }
        }
    }
}