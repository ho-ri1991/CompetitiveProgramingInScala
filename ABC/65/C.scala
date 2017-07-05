object Main {
  def solve(n: Long, m: Long, acc: Long): Long = {
    if (n == 0){
      if (m == 0){
        acc
      }else{
        0
      }
    }else {
      solve(m, n-1, (acc * n) % (1e9 + 7).toLong)
    }
  }

  def main(args: Array[String]): Unit = {
    val Seq(n,m): Seq[Int] = io.StdIn.readLine().split(' ').map(_.toInt)
    val x = (solve(n,m,1) + solve(m,n,1)) % (1e9 + 7).toLong
    println(x)
  }
}
