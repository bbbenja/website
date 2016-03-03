stage 'Build image'
node {
  checkout scm
  docker.build('ctwebsite').inside('-v /home/jenkins/.ssh:/home/ct/.ssh') {
    sh 'cd /src && gulp build --prod --drafts'
    sh 'cd - && tar -czvf source.tgz /src/public'
  }
}
