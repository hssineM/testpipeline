pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', credentialsId: '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', url: 'https://github.com/hssineM/testpipeline.git'
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
