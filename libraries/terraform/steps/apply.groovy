void call() {
    stage("apply")
        steps {
                    dir('workdir') {
                        sh 'echo "will apply"'
                    }
                }
    }
}