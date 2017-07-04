object Main {
  def main(args: Array[String]): Unit = {
    val n = io.StdIn.readLine().toInt
    val arr = io.StdIn.readLine().split(' ').map(_.toInt).sorted
    println((arr(0) - arr(n-1)) abs)
  }
}
