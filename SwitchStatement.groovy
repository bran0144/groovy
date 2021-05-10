int myOpportunity = 50000

switch(myOpportunity) {
  case 0..999:
    println "The best approach for opportunities of this size is email."
    break
  case 1000..4999:
    println "The best approach for opportunities of this size is telephone."
  break
  default:
    println "The best approach for opportunities of this size is face to face."
}
