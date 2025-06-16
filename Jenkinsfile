pipeline {
    agent any

//     tools {
//         maven 'M3'  // Doit correspondre à un Maven pré-configuré dans Jenkins
//         jdk 'JDK17' // Doit correspondre à un JDK configuré dans Jenkins
//     }

    stages {
        stage('Build') {
            steps {
            sh 'echo "Build"'
//                 sh 'mvn clean package'
//                 archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }


        }

        stage('Test') {
            steps {
//                 sh 'mvn test'
                    sh 'echo "Test"'
            }
//             post {
//                 always {
//                     junit 'target/surefire-reports/*.xml'
//                 }
//             }
        }

        stage('Build Docker Image') {
            when {
                branch 'main'
            }
            steps {
                sh 'echo "Building docker image"'
//                 script {
//                     docker.build("mon-project-spring:${env.BUILD_ID}")
//                 }
            }
        }

        stage('Deploy') {
//             when {
//                 branch 'main'
//             }
            steps {
                sh 'echo "deploying"'
//                 sh 'docker-compose up -d'
            }
        }
    }
}