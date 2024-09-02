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
                sh 'sudo apt install maven -y'
                sh 'mvn clean install'
            }
        }
    }
}
