pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                // Compila el proyecto Java utilizando Maven
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                // Ejecuta las pruebas unitarias
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // Construye la imagen Docker
                sh 'docker build -t myapp .'
                // Levanta el contenedor en el puerto 8081
                sh 'docker run -d -p 8081:8080 myapp'
            }
        }
    }
}
