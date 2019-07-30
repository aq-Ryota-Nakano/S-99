package lists

object P03 {

  def nth[A](n: Int, ls: List[A]): A = (n, ls) match {
    case (0, head :: _) => head
    case (`n`, _ :: tail) => nth(n - 1, tail)
    case (_, Nil) => throw new NoSuchElementException
//    case _ => throw new UnknownError()
  }

}
