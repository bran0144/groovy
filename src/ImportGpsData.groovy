def file = new File('../data/fells_loop.gpx')



def slurper = new XmlSlurper()
def gpx = slurper.parse(file)
println gpx.name
println ''
println gpx.desc
println ''
println gpx.@version
println gpx.@creator

gpx.rte.rtept.each {
  println it.@Lat
  println it.@Lon
  println it.time
}
