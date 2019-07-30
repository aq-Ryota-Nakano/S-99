package lists

import scala.annotation.tailrec

object P18 {
  // 単純な解
  def slice[A](s: Int, e: Int, ls: List[A]): List[A] = {
    ls.drop(s).dropRight(e)
    // ls drop s take (e - (s max 0))
  }

  def sliceRecursive[A](s: Int, e: Int, ls: List[A]): List[A] = (s, e, ls) match {
    case (_, _, Nil) => Nil
    case (_, e, _) if (e <= 0) => Nil
    case (s, e, h :: tail) if s <= 0 => h :: sliceRecursive(0, e - 1, tail)
    case (s, e, h :: tail) => sliceRecursive(s - 1, e - 1, tail)
  }

  def sliceTailRecursive2[A](s: Int, e: Int, ls: List[A]): List[A] = {
    @tailrec
    def sliceR(count: Int, curList: List[A], result: List[A]): List[A] = {
      if (curList.isEmpty || count >= e) result.reverse
      else sliceR(count + 1, curList.tail,
        if (count >= s) curList.head :: result
        else result)
    }
    sliceR(0, ls, Nil)
  }
}
