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
                       dir('CF-DevOps') {
                                               // Run Maven commands
                                               sh 'mvn clean package'
                                               sh "java -jar target/soulaiman-0.0.1-SNAPSHOT.jar"
                       }
                }
            }
         stage('artifact') {
                    steps {
                        archiveArtifacts artifacts: 'target/*.jar'
                    }
         }
//         stage('build docker image') {
//                             steps {
//                                        script {
//                                             withCredentials([usernamePassword(credentialsId: 'docker-hub-pass', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
//                                             dir('CF-DevOps') {
//                                              sh 'docker build -t soulaimandockerhub/cf-devops:latest .'
//                                              sh 'echo $PASS | docker login -u $USER --password-stdin'
//                                              sh 'echo push soulaimandockerhub/cf-devops:latest'
//                                              }
//                                         }
//                             }
//           }


        }
    }