package lists

object P05 {

  // 自分で作ったやつ
  //　無駄が多い

  def reverse[A](ls: List[A]): List[A] = {
    def go[`A`](newLs: List[A], oldLs:List[A]): (List[A], List[A]) = (newLs, oldLs) match {
      case (`newLs`, Nil) => (newLs, Nil)
      case (`newLs`, h :: tail) => go(h +: newLs, tail)
      case _ => throw new NoSuchElementException
    }
    val result = go(Nil, ls)
    result._1
  }

  // シンプルな再帰
  def reverseRecursive[A](ls: List[A]): List[A] = ls match {
    case Nil => Nil
    case h :: tail => reverseRecursive(tail) ::: List(h)
  }

  // 末尾再帰
  def reverseTailRecursive[A](ls: List[A]): List[A] = {
    def reverseR(result: List[A], curList: List[A]): List[A] = curList match {
      case Nil => result
      case h :: tail => reverseR(h :: result, tail)
    }
    reverseR(Nil, ls)
  }

  // 純粋関数
  def reverseFunction[A](ls:List[A]): List[A] = {
    ls.foldLeft(List[A]()){(r,h) => h :: r}
  }

}
