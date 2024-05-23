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
//                                                sh "java -jar target/soulaiman-0.0.1-SNAPSHOT.jar"
                       }
                }
            }
         stage('artifact') {
                    steps {
                        archiveArtifacts artifacts: 'CF-DevOps/target/*.jar'
                    }
         }

//          stage('Tag and Push') {
//                      steps {
//                          // Ajouter un tag Git pour marquer la version stable
//                          dir('CF-DevOps') {
//                             script {
//                                  def gitTag = "v1.${BUILD_NUMBER}"
//                                  sh "git tag ${gitTag}"
//                                  sh "git push origin ${gitTag}"
//                             }
//
//
//                          }
//                      }
//
//
//                  }
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

         post {
                success {
                    // Envoyer une notification Slack en cas de succès
                    slackSend message: "build done"
                }
                }
    }