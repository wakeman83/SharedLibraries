def checkOutfromgit(hudson.plugins.git.GitSCM repo, branch,credentials){
git branch: "${branch}",url:"${repo}", credentialsId: "${credentials}"
}
