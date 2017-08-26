pipeline {
    agent any
    tools {
        maven 'Maven 3.3.9'
        jdk 'Maven 3.5.0'
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh "mvn compile"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
