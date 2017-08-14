object Main {
  def main(args: Array[String]): Unit = {
    val Seq(n, m): Seq[Int] = io.StdIn.readLine().split(' ').map(_.toInt)
 
    val edges: collection.mutable.IndexedSeq[collection.mutable.ArrayBuffer[(Int, Long)]] =
      collection.mutable.IndexedSeq.fill(n)(collection.mutable.ArrayBuffer.empty)
 
    for(_ <- 0 until m) {
      val Seq(a, b, c): Seq[Int] = io.StdIn.readLine().split(' ').map(_.toInt)
      edges(a - 1) += b - 1 -> -c.toLong
    }
 
    val dist: collection.mutable.IndexedSeq[Long] = collection.mutable.IndexedSeq.fill(n)(Long.MaxValue)
    dist(0) = 0
 
    def solve(): Boolean = {
      val isInf: collection.mutable.IndexedSeq[Boolean] = collection.mutable.IndexedSeq.fill(n)(false)
      for(i <- 0 until n) {
        for(v <- 0 until n) {
          for(j <- 0 until edges(v).length) {
            val edge = edges(v)(j)
            if(dist(v) != Long.MaxValue && dist(edge._1) > dist(v) + edge._2) {
              dist(edge._1) = dist(v) + edge._2
              if (i == n - 1){
                isInf(edge._1) = true
              }
            }
          }
        }
      }
 
      return isInf(n - 1)
    }
 
    val isInf = solve()
    if(isInf)println("inf")
    else println(-dist(n - 1))
  }
}

