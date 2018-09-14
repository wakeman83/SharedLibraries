
pipeline {

  agent any

  stages {

    stage('Build & Test') {

      steps {
        checkout scm
        sh 'make'      
      }
    }
  }
}