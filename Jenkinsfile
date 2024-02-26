pipeline {
  agent any
  stages {
    stage('mvn build') {
      steps 
      {
        sh 'mvn clean package'
      }
    }
    stage('docker build') {
      steps
      {
        sh 'sudo docker build -t java_app .'
      }
    }
  }
}
