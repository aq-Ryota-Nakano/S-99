package lists

object P02 {
  def nextLastRecursive[A](ls: List[A]): A = ls match {
    case head :: _ :: Nil => head
    case _ :: tail => nextLastRecursive(tail)
    case _ => throw new NoSuchElementException
  }

}