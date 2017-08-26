pipeline {
    agent any
    tools {
        maven 'Maven 3.5.0'
        jdk 'JDK 8u144'
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
