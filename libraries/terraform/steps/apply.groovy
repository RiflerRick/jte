void call() {
    stage('Apply') {
        steps {
                    dir('workdir') {
                        sh 'echo "will apply"'
                    }
                }
    }
}