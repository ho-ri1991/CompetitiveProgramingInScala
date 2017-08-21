object Main {
  def main(args: Array[String]): Unit = {
    val Seq(a, b, c): Seq[String] = io.StdIn.readLine().split(' ')
 
    if(a.toCharArray.last == b.toCharArray.head && b.toCharArray.last == c.toCharArray.head) println("YES")
    else println("NO")
  }
}
