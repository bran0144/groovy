def inFile = new File('../data/fells_loop.gpx')
def slurper = new XmlSlurper()
def gpx = slurper.parse(inFile)

def markupBuilder = new groovy.xml.StreamingMarkupBuilder()
def xml = markupBuilder.bind{
  route {
    gpx.rte.rtept.each {point ->
      routepoint(timestmap: point.time.toString()){
        latitude(point.@Lat)
        longitute(point.@Lon)
    }
  }
  }
}

def outFile = new File('../data/fells_loop_truncated.xml')
outFile.write(xml.toString())
