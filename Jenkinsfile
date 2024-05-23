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
                // Here, we can can run Maven commands
                script {

                    def currentDir = pwd()
                    echo "Current directory: ${currentDir}"

                    // Navigate to the directory containing the Maven project
                    dir('./') {
                        // Run Maven commands
                        sh 'mvn clean test package'
                        sh "java -jar target/maven-0.0.1-SNAPSHOT.jar"
                    }


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
}