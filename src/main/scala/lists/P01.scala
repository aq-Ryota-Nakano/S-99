package lists

object P01 {

  /**
    * 自分で書いた奴
    * Ifを使った記述
    *
    * @param l
    * @tparam A
    * @return l.last
    */

  def recursion[A](l: List[A]): A = {
    if (l.tail.nonEmpty) recursion(l.tail) else l.head
  }

  /**
    * 参考の回答
    * なるべくパターンマッチングを使うようにしたい
    *
    * @param ls
    * @tparam A
    * @return
    */

  def lastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil => h
    case _ :: tail => lastRecursive(tail)
    case _ => throw new NoSuchElementException
  }

}