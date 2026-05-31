package edu.iti

def build(imageName, imageTag) {
    sh "docker build -t ${imageName}:${imageTag} ."
}

def push(imageName, imageTag) {
    sh "docker push ${imageName}:${imageTag}"
}

def login(username, password) {
    sh "docker login -u ${username} -p ${password}"
}