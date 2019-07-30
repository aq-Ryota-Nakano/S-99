package lists

object P04 {

  //　通常の再帰
  def length[A](ls: List[A]): Int = ls match {
    case Nil => 0
    case _ :: tail => 1 + length(tail)
  }

  // 末尾再帰
  def lengthTailRecursive[A](ls: List[A]): Int = {
    def lengthR(result: Int, curList: List[A]): Int = curList match {
      case Nil => result
      case _ :: tail => lengthR(result + 1, tail)
    }
    lengthR(0, ls)
  }

  // 関数型の書き方
  // FoldLeftの記法に慣れてすぐ思い浮かぶようになりたい
  def lengthFunction[A](ls: List[A]): Int = ls.foldLeft(0) { (c, _) => c + 1}
}
