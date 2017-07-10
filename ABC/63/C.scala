object Main {
  def main(args: Array[String]): Unit = {
    import collection._
    val n = io.StdIn.readLine().toInt
    val arr = for(i <- 0 until n) yield io.StdIn.readLine().toInt
    val ss = arr.sorted
    val sum = ss.foldLeft(0){_ + _}
    val ans = if (sum % 10 != 0){
      sum
    } else {
      ss.find(_ % 10 != 0) match {
        case None => 0
        case Some(x) => sum - x
      }
    }

    println(ans)
  }
}
