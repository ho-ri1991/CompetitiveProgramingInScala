object Main {
  def main(args: Array[String]): Unit = {
    val Seq(a, b, c): Seq[Int] = io.StdIn.readLine().split(' ').map(_.toInt)
 
    val ls = for(i <- 1 to b) yield (a * i) % b
    val ans = ls.find(_ == c) match {
      case Some(_) => "YES"
      case _ => "NO"
    }
    println(ans)
  }
}

