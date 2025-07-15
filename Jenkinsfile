pipeline {
    agent any

    tools {
        
        maven "MAVEN_HOME"
    }

    stages {
        stage('Build') {
            steps {
                
                git branch: 'main', url: 'https://github.com/Dem0nFace/LoginCase.git'

               
                bat "mvn -Dmaven.test.failure.ignore=true clean package"

                
               
            }

            post {
               
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
