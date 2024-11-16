pipeline {
    agent any
    tools {
        jdk 'JDK17'
        maven 'Maven3'
    }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Run') {
            steps {
                sh 'java -jar target/hola-mundo-0.0.1-SNAPSHOT.jar & sleep 5'
                sh 'curl -f http://localhost:8081 || (echo "Server not responding!" && exit 1)'
            }
        }
    }
}
