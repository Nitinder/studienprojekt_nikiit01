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
                cd ..\Studienarbeit_Pipeline\studienprojekt
                echo Cleaning...
                mvn clean
                '''                    
            }
        }
        stage ('Package') {
            steps {
                bat '''
                echo Packaging application
                mvn package
                '''
            }
        }
        stage ('Test') {
            steps {
                bat 'echo Testing application'
            }
        }
        stage ('Docker image') {
            steps {
                bat 'echo Building docker image'
            }
        }
        stage ('Docker container') {
            steps {
                bat 'echo Starting docker container'
            }
        }
        stage ('User acceptance test') {
            steps {
                input('Do you want to proceed and publish?')
            }
        }
    }
}