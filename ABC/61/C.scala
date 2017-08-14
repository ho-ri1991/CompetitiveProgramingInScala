object Main {
  def main(args: Array[String]): Unit = {
    val Seq(n, k): Seq[Long] = io.StdIn.readLine().split(' ').map(_.toLong)
 
    val ops = for(_ <- 0 until n.toInt) yield {
      val Seq(a, b): Seq[Int] = io.StdIn.readLine().split(' ').map(_.toInt)
      (a, b)
    }
    val opsSorted = ops.sorted
 
    var acc = 0.toLong
    var ans = 0
    opsSorted.foreach{ case (a, b) =>
        acc += b
        if (k <= acc && ans == 0){
          ans = a
        }
    }
    println(ans)
  }
}

