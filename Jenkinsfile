pipeline {
    agent any

    tools {
        maven "MAVEN_HOME"
    }

    stages {
        stage('Build') {
            steps {
                git branch: 'main', url: 'https://github.com/Dem0nFace/LoginCase.git'
                bat "mvn -Dmaven.test.failure.ignore=true clean test"
            }

            post {
                success {
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
