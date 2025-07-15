pipeline {
    agent any

    tools {
        maven "MAVEN_HOME"
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Dem0nFace/LoginCase.git'
            }
        }

        stage('Build') {
            steps {
                bat "mvn clean test"
            }
        }

        stage('Test') {
            steps {
                bat "mvn -Dmaven.test.failure.ignore=true test -DsuiteXmlFile=LoginSuite.xml"
            }
            post {
                always {
                    allure([
                        includeProperties: false,
                        jdk: '',
                        results: [[path: 'allure-results']]
                    ])
                }
            }
        }
    }
}
