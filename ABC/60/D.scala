object Main {
  def main(args: Array[String]): Unit = {
    val Seq(n, w): Seq[Int] = io.StdIn.readLine().split(' ').map(_.toInt)
    val (ws, vs) = (for(i <- 0 until n) yield {val Seq(w, v): Seq[Int] = io.StdIn.readLine().split(' ').map(_.toInt); (w, v)}).unzip
    val offset = ws.head - 1
    val reducedWs = ws.map(_ - offset)
 
    val dp: Array[Array[Array[Long]]] = Array.fill(n)(Array.fill(n + 1)(Array.fill(n * 4 + 1)(0)))
 
    if(ws(0) <= w) {
      dp(0)(1)(reducedWs(0)) = vs(0)
    }
 
    for(item <- 1 until n) {
      for(num <- 1 to n) {
        for(weight <- 0 to 4 * n) {
          val sub = weight - reducedWs(item)
          if(0 <= sub && (num - 1 == 0 || 0 < dp(item - 1)(num - 1)(sub)) && weight.toLong + offset.toLong * num.toLong <= w) {
            dp(item)(num)(weight) = dp(item - 1)(num)(weight) max (dp(item - 1)(num - 1)(sub) + vs(item))
          } else {
            dp(item)(num)(weight) = dp(item - 1)(num)(weight)
          }
        }
      }
    }
 
    var ans = 0.toLong
    for(num <- 1 to n) {
      for(weight <- 0 to 4 * n) {
        ans = ans max dp(n - 1)(num)(weight)
      }
    }
 
    println(ans)
  }
}
