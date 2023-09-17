object Q1 extends App {
  def calcAvg(temp: List[Double]) : Double = {
    var fahr = temp.map(cels => (cels*9/5) + 32)
    var total = fahr.reduce(_+_)
    var avg = total / fahr.length
    avg
  }

  val temp_list = List(0.0, 10.0, 20.0, 30.0)
  var x = calcAvg(temp_list)
  println(x)
}