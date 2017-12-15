package viswa_collections

object SatishA {
  def main(args :Array[String]) = {
    val l =(0 to 100).toList
    val a = l.partition((p: Int) => p%2 == 0)
    println(a)
  }
  
}