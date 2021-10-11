pipeline{
    agent any
    stages{
        stage("checkout"){
            steps{
                checkout()
            }
        }
        stage("setup") {
            steps {
                setup()
            }
        }
        stage("plan"){
            steps {
                plan()
            }
        }
        stage("apply"){
            steps{
                apply()
            }
        }
        stage("post_apply"){
            steps{
                post_apply()
            }
        }
    }
    
}
            