object Main {
  def main(args: Array[String]): Unit = {
    import collection._
    val Seq(a, b): Seq[Int] = io.StdIn.readLine().split(' ').map(_.toInt)
    val ans = a + b
    if (ans < 10){
      println(ans)
    }else{
      println("error")
    }
  }
}
