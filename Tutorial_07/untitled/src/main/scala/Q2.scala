object Q2 extends App {
  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(n => n*n)
  }

  val List2 = List(1, 2, 3, 4, 5)
  println(calculateSquare(List2))
}