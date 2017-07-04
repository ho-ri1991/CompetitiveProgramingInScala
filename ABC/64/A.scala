object Main {
  def solve(r: Int, g: Int, b: Int): String = {
    val n = r * 100 + g * 10 + b
    if (n % 4 == 0) "YES"
    else "NO"
  }

  def main(args: Array[String]): Unit = {
    val Seq(r,g,b): Seq[Int] = io.StdIn.readLine().split(' ').map(_.toInt)
    println(solve(r,g,b))
  }
}
