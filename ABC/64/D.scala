object Main {
  def main(args: Array[String]): Unit = {
    import collection._
    val n = io.StdIn.readLine()
    val str = io.StdIn.readLine()

    val (l, r) = str.foldLeft((0,0)){
      case ((lacc, acc), c) => {
        c match {
          case '(' => (lacc, acc + 1)
          case ')' if acc == 0 => (lacc + 1, 0)
          case _ => (lacc, acc - 1)
        }
      }
    }

    val left = Seq.fill(l)('(')
    val right = Seq.fill(r)(')')
    println(left.mkString + str + right.mkString)
  }
}