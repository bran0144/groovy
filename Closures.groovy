(1..10).findAll({ return it % 2 == 0}).each({ i ->
  println "In a closure: $i"
})
