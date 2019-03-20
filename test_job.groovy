
job('Test Job') {
    scm {
        git('https://github.com/averdier/enigma_jenkins_python') {  node -> 
            node / gitConfigName('rastadev')
            node / gitConfigEmail('arthur@elonet.fr')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    steps {
        shell("python test.py")
        shell("python main.py")
    }
}