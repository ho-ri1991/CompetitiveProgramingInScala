object Main {
  def solve(i:Int, n: Int, maxNum: Int, arr: IndexedSeq[Int]):Int = {
    if (n == maxNum){
      -1
    }else{
      if(arr(i)==1){
        n + 1
      }else{
        solve(arr(i), n+1, maxNum, arr)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val n = io.StdIn.readLine().toInt
    val arr = for(i <- 0 until n) yield io.StdIn.readLine().toInt-1
    println(solve(0,0,n,arr))
  }
}
