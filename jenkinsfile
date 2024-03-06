pipeline{
    agent any
    tools{
        maven "maven"
    }
    stages{
        stage("Checkout scm"){
            steps{
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/NABEELM1998/DemoCICD.git']])
            }
        }

        stage("build"){
            steps{
                sh 'mvn clean install'
            }
        }
    }
}