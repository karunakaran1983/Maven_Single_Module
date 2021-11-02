job('Maven_DSL_JOB') {
    logRotator(3, 3)
    scm {
        git('https://github.com/karunakaran1983/Maven_Single_Module.git', 'master')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean build compile package','Maven_Single_Module/pom.xml')
    }
    publishers {
        archiveArtifacts '**/*.jar'
    }
}