pipeline
{
    agent any
    stages
    {
        stage('code checkout') {
            steps{
                echo 'code checkout complete'
            }
        }
        stage('maven build') {
            steps{
                sh 'mvn clean install'
                echo ' build complete'
            }
        }
        stage('docker build') {
            steps{
                script {
                    def dockerImage = "sangeetha1501/java_app:${env.BUILD_NUMBER}"
                    sh "docker build -t $dockerImage ."
                }
            }
        }
       stage('docker Push') {
           steps{
                script {
                    withDockerRegistry([ credentialsId: "dockerhub", url: "https://index.docker.io/v1/" ]) {
                   //sh 'echo \$DOCKER_HUB_PASSWORD | docker login -u \$DOCKER_HUB_USERNAME --password-stdin'
                  sh "docker push sangeetha1501/java_app:${env.BUILD_NUMBER}"
                    }
                }
           }
       }
        stage('docker run') {
            steps{
                sh "docker run -p 81:80 -d sangeetha1501/java_app:${env.BUILD_NUMBER}"
            }
        }
    }
}
