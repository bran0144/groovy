int opportunity1 = 1000
int opportunity2 = 2000
int opportunity3 = 3000
int opportunity4 = 4000
int opportunity5 = 5000
int totalOpportunity = 0

List opportunities = [opportunity1, opportunity2, opportunity3, opportunity4, opportunity5]

int counter = 0
while(counter < opportunities.size){
  println "Found an opportunity of ${opportunities[counter]}"
  totalOpportunity += opportunities[counter]
  println "Total opportunity is now $totalOpportunity"
  counter ++
}
