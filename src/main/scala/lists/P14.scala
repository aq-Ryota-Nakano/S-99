package lists

object P14 {
  def duplicate[A](ls: List[A]): List[A] = {
    ls.flatMap(x => List[A](x, x))
  }
}
