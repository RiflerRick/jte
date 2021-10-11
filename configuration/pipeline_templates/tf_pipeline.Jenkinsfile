pipeline{
    agent any

    stages{
        stage("checkout"){
            checkout()
        }
        stage("setup"){
            setup()
        }
        stage("plan"){
            plan()
        }
        stage("apply"){
            apply()
        }
        stage("post_apply"){
            post_apply()            
        }
    }
}
            