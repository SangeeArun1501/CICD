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
        def dockerImage = "sangeetha1501/java_app:${env.BUILD_NUMBER}"
         sh "docker build -t $dockerImage ."
      }
      }
    }
    stage('docker Push') {
      steps
      {
        script {
        withDockerRegistry([ credentialsId: "dockerhub", url: "https://index.docker.io/v1/" ]) {
          sh 'echo $DOCKER_HUB_PASSWORD | docker login -u $DOCKER_HUB_USERNAME --password-stdin'
          sh "docker push sangeetha1501/java_app:${env.BUILD_NUMBER}"
        }
  }
}
    }
  }
}



