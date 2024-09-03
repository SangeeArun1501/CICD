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
            }
        }
        stage('docker build and push') {
            steps{
                script {
                    withCredentials([usernamePassword(credentialsId: 'dockercred', usernameVariable: 'Docker_Username', passwordVariable: 'Docker_Password')]) 
                    {
                        sh 'echo $Docker_Password | docker login -u $Docker_Username --password-stdin' 
                        sh 'docker build -t webapp .'
                        sh 'docker tag webapp $Docker_Username/webapp'
                        sh 'docker push $Docker_Username/webapp'
                    }
            }
        }
    }
        stage('app deploy') {
            steps {
                 sh 'docker run -p 3000:8080 -d $Docker_Username/webapp'
            }
        }
}
}
