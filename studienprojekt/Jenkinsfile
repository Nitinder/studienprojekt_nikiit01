pipeline {
    agent any
    stages {
        stage ('Clone') {
            echo 'Cloning Repo'
        }
        stage ('Clean') {
            echo 'Cleaning...'
        }
        stage ('Package') {
            echo 'Packaging application'
        }
        stage ('Docker image') {
            echo 'Building docker image'
        }
        stage ('Docker container') {
            echo 'Starting docker container'
        }
        stage ('User acceptance test') {
            input('Do you want to proceed and publish?')
        }
    }
}