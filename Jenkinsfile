pipeline {
    agent any
//    tools {
//        maven 'Maven 3.5.0'
//        jdk 'JDK 8u144'
//    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh "mvn compile"
            }
        }
//	stage('Nexus Scan') {
//	    steps {
//		nexusPolicyEvaluation iqApplication: 'sandbox-application', iqStage: 'build'
  //          }
//	}
        stage('Developer Tests') {
            steps {
                echo 'Testing..'
                sh 'mvn test'
            }
        }
//        stage('Static Analysis') {
//          steps {
//              echo 'Analyzing source code'
//              sh 'mvn sonar:sonar'
//          }
//        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sh 'mvn package'
            }
        }
	stage('Nexus Scan') {
            steps {
                nexusPolicyEvaluation iqApplication: 'sandbox-application', iqStage: 'build'
            }
        }

    }
}
