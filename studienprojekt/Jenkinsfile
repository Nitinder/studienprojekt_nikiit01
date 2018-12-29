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
                'echo Cleaning...'                    
            }
        }
        stage ('Package') {
            steps {
                'echo Packaging application'
            }
        }
        stage ('Docker image') {
            steps {
                'echo Building docker image'
            }
        }
        stage ('Docker container') {
            steps {
                'echo Starting docker container'
            }
        }
        stage ('User acceptance test') {
            steps {
                input('Do you want to proceed and publish?')
            }
        }
    }
}