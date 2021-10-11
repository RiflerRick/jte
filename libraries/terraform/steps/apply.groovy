void call() {
        steps {
                    dir('workdir') {
                        sh 'echo "will apply"'
                    }
                }
}