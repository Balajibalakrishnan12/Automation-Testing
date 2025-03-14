pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                echo 'build test'
            }
        }
        stage('Test'){
            steps{
                echo 'run test'
                sh 'mvn verify clean'
            }
        }
        stage('Deploy'){
            steps{
                echo 'deployment done'
            }
        }
    }
}
