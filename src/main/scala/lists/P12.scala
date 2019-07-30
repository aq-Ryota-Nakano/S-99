package lists

import scala.annotation.tailrec

object P12 {
  // 自力で解いたやつ
  def decode[A](ls: List[(Int, A)]): List[A] = ls match {
    case Nil => List()
    case h :: tail => List.fill(h._1)(h._2) ++ decode(tail)
  }

  def decodeR[T](encoded: List[Any]): List[T] = {
    @tailrec
    def go(encoded: List[Any], result: List[T]): List[T] = encoded match {
      case (n: Int, e: T) :: xs => go(xs, result ++ List.fill(n)(e))
      case (e: T) :: xs => go(xs, result :+ e)
      case Nil => result
    }

    go(encoded, List())
  }
}
