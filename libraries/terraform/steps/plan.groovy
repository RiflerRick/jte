void call() {
            steps {
                    script {
                        dir("workdir") {
                            withCredentials([file(credentialsId: 'global-image-sharing-svc-account-key', variable: 'svc_account_key')]) {
                                writeFile file: 'svc-account-key.json', text: readFile(svc_account_key)
                                sh '''
                                #!/bin/bash
                                terraform plan
                                '''
                            }
                        }
                        

                        timeout(time: 1, unit: 'HOURS') {
                            input(id: 'confirm', message: 'Apply Terraform?')
                        }
                    }
                }
}