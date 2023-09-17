object Q1 extends App{
  val interest:Double => Double = {
    case x if x<= 20000 => x*0.02
    case x if x<= 200000 => x*0.04
    case x if x<= 2000000 => x*0.035
    case x => x*0.065
  }

  println(interest(40000));
}