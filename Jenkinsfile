pipeline {
    agent any
    stages {
        stage('Build Appln') {
            steps {
                echo "compile and package using maven"
                sh 'mvn clean package'
            }
            post {
                success {
                    echo "Archive the artifacts..."
                    archiveArtifacts artifacts: '**/*.jar'
                }
            }
        }
    }
}