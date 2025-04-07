node {
    def app
    stage('Clone repository') {
        checkout scm
    }
    stage('Build image') {
       app = docker.build("ivanov1332/kiii-homework1")
    }
    stage('Push image') {   
        docker.withRegistry('https://registry.hub.docker.com', 'ivanov1332-dockerhub') {
            app.push("${env.BRANCH_NAME}-${env.BUILD_NUMBER}")
            app.push("${env.BRANCH_NAME}-latest")
            // signal the orchestrator that there is a new version
        }
    }
}