void call(){
        stage("checkout"){
                steps {
                    dir("workdir") {
                        checkout scm: [$class: 'GitSCM',
                            userRemoteConfigs: [[url: 'https://github.com/RiflerRick/nginx-terraform.git']],
                                                branches: [[name: 'refs/heads/main']]
                            ], poll: true, changelog: true
                    }
                    
                }
        }
}