object Main {
  def main(args: Array[String]): Unit = {
    val Seq(n, m): Seq[Int] = io.StdIn.readLine().split(' ').map(_.toInt)
 
//    import scala.collection.mutable.IndexedSeq
    val ans = collection.mutable.IndexedSeq.fill(n)(0)
    for(_ <- 0 until m) {
      val Seq(a, b): Seq[Int] = io.StdIn.readLine().split(' ').map(_.toInt - 1)
      ans(a) += 1
      ans(b) += 1
    }
 
    ans.foreach(println)
  }
}

