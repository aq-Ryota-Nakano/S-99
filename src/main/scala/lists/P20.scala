package lists

object P20 {
  def removeAt[A](n: Int, ls: List[A]): (List[A], A) = {
    val index = if (n >= 0) n else n + ls.length
    (ls.take(index) ::: ls.drop(index + 1), ls(index))
  }

  def removeAtAns[A](n: Int, ls: List[A]): (List[A], A) =
    if (n < 0) throw new NoSuchElementException
    else (n, ls) match {
      case (_, Nil) => throw new NoSuchElementException
      case (0, h :: tail) => (tail, h)
      case (_, h :: tail) => {
        val (t, e) = removeAt(n - 1, ls.tail)
        (ls.head :: t, e)
      }
    }
}
