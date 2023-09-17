object Q3 extends App{
  def formatNames(name:String, fun:String=>String, pos:Int) = {
    var newname2 = ""
    newname2 += name.substring(0,pos)
    newname2 += fun(name).charAt(pos)
    newname2 += name.substring(pos+1)
    newname2
  }

  println(formatNames("Benny", name => name.toUpperCase, 0))
  println(formatNames("Niroshan", name => name.toUpperCase, 1))
  println(formatNames("Saman", name => name.toLowerCase, 0))
  println(formatNames("Kumara", name => name.toUpperCase, 5))
}