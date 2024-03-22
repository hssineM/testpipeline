pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'master',
                   credentialsId: 'your-credentials-id',
                   url: 'https://github.com/hssineM/testpipeline.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install' // Replace with your build command (e.g., npm install, etc.)
            }
        }
    }
}
