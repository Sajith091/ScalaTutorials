object Q1 extends App {
  def filterEvenNumbers(values: List[Int]): List[Int] = {
    values.filter(n => n % 2 == 0)
  }

  val List1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  println(filterEvenNumbers(List1))
}