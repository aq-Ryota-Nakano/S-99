package lists

object P17 {
  def splitRecursive[A](n: Int, ls: List[A]): (List[A], List[A]) = (n, ls) match {
    case (_, Nil) => (Nil, Nil)
    case (0, list) => (Nil, list)
    case (n, h :: tail) => {
      val (pre, post) = splitRecursive(n - 1, tail)
      (h :: pre, post)
    }
  }

  def splitFunctional[A](n: Int, ls: List[A]): (List[A], List[A]) =
    (ls.take(n - 1), ls.drop(n))
}
