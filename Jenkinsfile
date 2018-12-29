pipeline {
    agent any
    stages {
        stage ('Clone') {
            steps {
                bat 'echo Cloning Repo'
            }          
        }
        stage ('Clean') {
            steps {
                bat 'echo Cleaning...'                    
            }
        }
        stage ('Package') {
            steps {
                bat 'echo Packaging application'
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