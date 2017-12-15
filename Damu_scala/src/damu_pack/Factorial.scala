package damu_pack

object Factorial {
  def main(args: Array[String]) = {
    val a :Int =10
    var res: Int = 1
    for (ele <- a to 2 by -1) {
      res = res * ele
    }
    print(res)
  }
}