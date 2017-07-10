object Main {
  def main(args: Array[String]): Unit = {
    import collection._
    val str = io.StdIn.readLine()
    val arr = str.toList
    val uniq = arr.distinct
    val ans = if(str.length == uniq.length)"yes" else "no"
    println(ans)
  }
}