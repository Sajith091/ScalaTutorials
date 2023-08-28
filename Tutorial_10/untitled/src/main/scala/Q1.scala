object Q1 extends App {
  def main(args: Array[String]): Unit = {
    val celsiusTemperatures = List(0.0, 10.0, 20.0, 30.0, 40.0)
    val averageFahrenheit = calculateAverage(celsiusTemperatures)
    println(s"Average Fahrenheit Temperature: $averageFahrenheit")
  }
}
    def calculateAverage(tempList: List[Double]): Double = {

      val fahrenheitTemperatures = tempList.map(celsius => (celsius * 9 / 5) + 32)
      println(fahrenheitTemperatures)
      val result = fahrenheitTemperatures.reduce((_ + _))
      val avg = result / tempList.length.toDouble
      avg
  }
