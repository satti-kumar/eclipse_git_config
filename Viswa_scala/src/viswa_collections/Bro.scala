package viswa_collections

case class Order(
                  orderId: Int,
                  orderDate: String,
                  orderCustomerId: Int,
                  orderStatus: String
                )

object Bro {
  def main(args :Array[String]) = {

val os = List(
  Order(1, "2017-01-01", 100, "COMPLETE"), 
  Order(2, "2017-01-01", 20, "CLOSED"),
  Order(3, "2017-01-01", 301, "PENDING"),  Order(4, "2017-01-01", 202, "CLOSED"),
  Order(5, "2017-01-01", 3013, "COMPLETE"),
  Order(6, "2017-01-01", 203, "PENDING"),
  Order(7, "2017-01-01", 3014, "COMPLETE"),
  Order(8, "2017-01-01", 20, "NEW"),
  Order(9, "2017-01-01", 301, "PENDING"),
  Order(10, "2017-01-01", 2, "CLOSED"),
  Order(11, "2017-01-01", 1, "COMPLETE"),
  Order(12, "2017-01-01", 3, "NEW"),
  Order(13, "2017-01-01", 301, "COMPLETE")
)
//os.map(x => x.orderDate.replace("-", "/")).foreach(println)
//os.filter(x => x.orderStatus == "COMPLETE").foreach(println)
val stat = os.filter(x => x.orderStatus == "COMPLETE")
//os.sortBy(o =>o.orderCustomerId).foreach(println)
}
}