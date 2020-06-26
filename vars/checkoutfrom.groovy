def checkOutfromgit(repo, branch,credentials){
git branch: "${branch}",url:"${repo}", credentialsId: "${credentials}"
}
