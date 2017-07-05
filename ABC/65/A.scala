object Main {
  def main(args: Array[String]): Unit = {
    val nums = io.StdIn.readLine().split(' ').map(_.toInt)
    val ans = if(nums(2) - nums(1) <= 0){
      "delicious"
    }else if(0 < nums(2) - nums(1) && nums(2) - nums(1) <= nums(0)){
      "safe"
    }else{
      "dangerous"
    }
    println(ans)
  }
}
