package lists

object P15 {
  def duplicateN[A](N: Int, ls:List[A]): List[A] = {
    ls.flatMap(e => List.fill(N)(e))
  }
}
