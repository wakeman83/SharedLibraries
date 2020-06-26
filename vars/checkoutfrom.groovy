def checkOut(hudson.plugins.git.GitSCM repo, branch,credentials){
git branch: "${branch}",url:"${repo}", credentialsId: "${credentials}"
}
