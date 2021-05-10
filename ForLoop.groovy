int opportunity1 = 1000
int opportunity2 = 2000
int opportunity3 = 3000
int opportunity4 = 4000
int opportunity5 = 5000
int totalOpportunity = 0

List opportunities = [opportunity1, opportunity2, opportunity3, opportunity4, opportunity5]


for (int i=0; i < opportunities.size; i++){
  println "Found an opportunity of ${opportunities[i]}"
  totalOpportunity += opportunities[i]
  println "Total opportunity is now $totalOpportunity"
}
