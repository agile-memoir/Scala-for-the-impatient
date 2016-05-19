package chapter_01

import scala.math.BigInt.probablePrime
import scala.util.Random

object ProbablePrime extends App {
  val primeHopeful: BigInt = probablePrime(100, Random)

  println(primeHopeful)
}
