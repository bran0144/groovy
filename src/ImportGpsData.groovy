def file = new File('../data/fells_loop.gpx')



def slurper = new XmlSlurper()
def gpx = slurper.parse(file)
println gpx.name
println ''
println gpx.desc
println ''
println gpx.@version
println gpx.@creator

for (point in gpx.rte.rtept) {
  println point.@Lat
  println point.@Lon
  println point.time
}
