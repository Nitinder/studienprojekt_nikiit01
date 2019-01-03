pipeline {
    agent any
    stages {
        stage ('Clone') {
            steps {
                bat 'echo Pulled Repo!'
            }          
        }
        stage ('Clean') {
            steps {
                bat '''
                cd studienprojekt
                echo Cleaning...
                mvn clean
                '''                    
            }
        }
        stage ('Package') {
            steps {
                bat '''
                cd studienprojekt
                echo Packaging application...
                mvn package
                '''
            }
        }
        stage ('Test') {
            steps {
                bat '''
                cd studienprojekt
                echo Testing application
                mvn test
                '''
            }
        }
        stage ('Docker image') {
            steps {
                bat '''
                cd studienprojekt
                echo Building docker image
                docker build -f Dockerfile -t studienprojekt_application_devops .
                '''
            }
        }
        stage ('Docker container') {
            steps {
                bat '''
                cd studienprojekt
                echo Starting docker container
                docker run -p 8085:8085 studienprojekt_application_devops
                '''
            }
        }
        stage ('User acceptance test') {
            steps {
                input('Do you want to proceed and publish?')
            }
        }
    }
}