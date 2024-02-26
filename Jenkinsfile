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
        //sh 'docker build -t java_app .'
        dockerImage = docker.build("sangeetha1501/java:latest")
      }
    }
    stage('docker Push') {
      steps
      {
        withDockerRegistry([ credentialsId: "dockerhub", url: "" ]) {
        dockerImage.push()
  }
}
    }
  }
}
