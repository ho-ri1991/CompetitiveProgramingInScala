object Main {
  def main(args: Array[String]): Unit = {
    val Seq(a, b, c): Seq[Int] = io.StdIn.readLine().split(' ').map(_.toInt)
 
    if (a <= c && c <= b) println("Yes")
    else println("No")
  }
}

