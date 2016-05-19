package chapter_01

object Substring extends App{
  val a: String = "tesla"
  println(a.takeRight(10)) //no exception
  println(a.take(3))
  println(a.drop(10)) //no exception
  println(a.drop(3))
}
