pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', credentialsId: 'your-git-credentials-id', url: 'https://github.com/hssineM/testpipeline.git'
            }
        }
        stage('Build') {
            steps {
                // Build commands for your project (e.g., mvn clean install, gradle build)
            }
        }
        // Add additional stages for testing, deployment, etc.
    }
}
