package lists

object P21 {
  def insertAt[A](e: A, n: Int, ls: List[A]): List[Any] = ls.splitAt(n) match {
    case (pre, post) => pre ::: e :: post
  }
}
