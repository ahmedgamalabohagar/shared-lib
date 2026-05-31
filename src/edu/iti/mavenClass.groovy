package edu.iti

def build(commandOption) {
    sh "mvn ${commandOption}"
}

def test(outOption) {
    sh "mvn test"
}