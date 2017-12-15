package scalacode

object SatishAa {
  def main(args :Array[String]) = {
    val l =(0 to 100).toList
    val a = l.partition((p: Int) => p%2 == 0)
    println(a)
  }
}