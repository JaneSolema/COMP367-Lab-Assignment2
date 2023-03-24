pipeline {
    agent any

    environment {
        GITHUB_TOKEN = credentials('github-token')
    }

    stages {
        stage('Checkout') {
            steps {
                checkout([
                    $class: 'GitSCM',
                    branches: [[name: '*/main']],
                    userRemoteConfigs: [[
                        url: 'https://github.com/JaneSplema/COMP367-LabAssignment2.git',
                        credentialsId: 'github-token'
                    ]]
                ])
            }
        }

        // other stages
    }
}
        
