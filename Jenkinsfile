pipeline {
    agent any
    stages {
        stage("Compile") {
          steps {
            sh "./gradlew compileJava"
          }
        }
        stage("Build") {
          steps {
            sh '''
            apt-get update
            apt-get install -y openjdk-17-jdk
            ./gradlew clean build
            '''
          }
        }
        stage("Unittest") {
          steps {
            sh "./gradlew test"
          }
        }
    }
}