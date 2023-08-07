object Q1 extends App{
  def main(args: Array[String]): Unit = {
    def filterEvenNumbers(numberList :List[Int]): List[Int] ={
      numberList.filter(number =>number%2==0)
    }
    val numberList : List[Int] = List(1,2,3,4,5,6,7,8,9,10)
    println(filterEvenNumbers(numberList))
   }
}