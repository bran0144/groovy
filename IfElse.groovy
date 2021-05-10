def myOpportunity = 3000

if (myOpportunity < 1000) {
  println "The best approach for oppurtunities of this size is email."
} else if (myOpportunity >= 1000 && myOpportunity < 5000) {
  println "The best approach for opportunities of this size is telephone."
} else {
  println "The best approach for opportunities of this size is face to face."
}
