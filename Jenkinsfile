pipeline{
    agent any

    stages{
        stage("Build"){
            steps{
                echo 'Hello to java World'
            }
        }
        stage("Branch") {
            steps {
                git branch: 'main', url: 'https://github.com/harshit005/Maven_Assignment_Group_1.git'
            }
        }
        stage("Test"){
            steps{
                echo 'Testing the Jenkins file'
            }
        }
    }
}
