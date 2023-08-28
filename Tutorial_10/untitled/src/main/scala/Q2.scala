object Q2{
  def main(args: Array[String]): Unit = {
    val words = List("apple", "banana", "cherry", "date")
    val totalCount = countLetterOccurrences(words)
    println(s"Total count of letter occurrences: $totalCount")
  }
}
def countLetterOccurrences(words: List[String]): Int = {
  // Use map to transform words into their respective lengths
  val wordLengths = words.map(word => word.length)

  // Use reduce to calculate the total count of letter occurrences
  val totalLetterOccurrences =
    wordLengths.reduce((total, length) => total + length)

  totalLetterOccurrences
}
