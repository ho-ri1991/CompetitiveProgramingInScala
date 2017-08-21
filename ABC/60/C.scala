object Main {
  def main(args: Array[String]): Unit = {
    val Seq(n, t): Seq[Int] = io.StdIn.readLine().split(' ').map(_.toInt)
    val ts = io.StdIn.readLine().split(' ').map(_.toLong)
 
    val (ans, _) = ts.foldLeft((0.toLong, 0.toLong)){(z, time) =>
      val (acc, prev) = z
      val add = if (time - prev <= t) time - prev else t.toLong
      (add + acc, time)
    }
 
    println(ans + t)
  }
}
