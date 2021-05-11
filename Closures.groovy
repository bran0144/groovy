def myClosure = {
  println "In a closure"
  println new Date()
}
for (i in 1..3) {
  myClosure()
  sleep(1000)
}
