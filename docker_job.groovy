job('Docker Job') {
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
        shell("docker build -t enigma/test_python3 .")
        shell("docker run --rm enigma/test_python3 python test.py")
        shell("docker run --rm enigma/test_python3 python main.py")
        shell("docker image rm enigma/test_python3")
    }
}