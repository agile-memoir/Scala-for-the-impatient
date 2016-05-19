package chapter_01

import scala.util.Random

object Base36 extends App{

  val randomBigInt: BigInt = BigInt(100, Random)
  println(randomBigInt.toString(36))
}
