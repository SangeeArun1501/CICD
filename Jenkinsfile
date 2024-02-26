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
        script {
        //sh 'docker build -t java_app .'
     def dockerImage = docker.build("sangeetha1501/java:latest")
      }
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
