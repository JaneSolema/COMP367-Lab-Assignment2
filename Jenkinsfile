pipeline {
    agent any
    triggers {
        githubPush()
    }
    stages {
        stage('Display build info') {
            steps {
                echo "Jenkins URL: ${env.JENKINS_URL}"
                echo "Build ID: ${env.BUILD_ID}"
            }
        }
    }
}