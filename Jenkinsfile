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
                sh 'sudo apt install maven'
                sh 'mvn clean install'
            }
        }
    }
}
