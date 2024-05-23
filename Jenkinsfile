pipeline {
    agent any
    // tools {
    //     maven "maven-3.9"
    // }
    stages {
        stage('Checkout') {
            steps {
                // clean the directory
                sh "rm -rf *"
                // Checkout the Git repository
                sh "git clone https://github.com/soulaimanGhailan/CF-DevOps"
            }
        }
        stage('Build') {
            steps {
                        sh 'mvn clean test package'
                        sh "java -jar target/maven-0.0.1-SNAPSHOT.jar"
                }
            }
        }
    }
//     post {
//         always{
//         }
//         failure {
//         }
//         success {
//         }
//     }
