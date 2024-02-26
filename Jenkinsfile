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
       sh 'docker build -t java_app .'
      }
    }
    stage('docker Push') {
      steps
      {
        withDockerRegistry([ credentialsId: "dockerhub", url: "https://index.docker.io/v1/" ]) {
          sh 'echo $DOCKER_HUB_PASSWORD | docker login -u $DOCKER_HUB_USERNAME --password-stdin'
          sh ' docker push sangeetha1501/java_app:latest'
  }
}
    }
  }
}
