pipeline{
    agent any
    environment {
        MAVEN_HOME='C:/Program Files/Apache/Maven/apache-maven-3.9.9'
        PATH="$MAVEN_HOME/bin:$PATH"
    }
    stages{
        stage('Build'){
            steps{
                echo 'build test'
            }
        }
        stage('Test'){
            steps{
                echo 'run test'
                bat 'mvn verify clean'
            }
        }
        stage('Deploy'){
            steps{
                echo 'deployment done'
            }
        }
    }
}
