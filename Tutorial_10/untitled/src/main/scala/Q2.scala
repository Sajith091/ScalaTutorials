object Q2 extends App{
  def occurence(words: List[String]) : Int = {
    var count = words.map(word => word.length)
    var total = count.reduce(_+_)
    total
  }

  val word_list = List("apple", "banana", "cherry", "date")
  var count = occurence(word_list)
  println(count)
}