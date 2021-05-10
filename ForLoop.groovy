int opportunity1 = 1000
int opportunity2 = 2000
int opportunity3 = 3000
int opportunity4 = 4000
int opportunity5 = 5000
int totalOpportunity = 0

List opportunities = [opportunity1, opportunity2, opportunity3, opportunity4, opportunity5]


for (int opportunity in opportunities){
  println "Found an opportunity of ${opportunity}"
  totalOpportunity += opportunity
  println "Total opportunity is now $totalOpportunity"
}
