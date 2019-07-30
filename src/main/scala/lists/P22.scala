package lists

object P22 {
  def range(s: Int, e: Int): List[Int] = {
    val res = for (n <- s to e) yield {
      n
    }
    res.toList
  }
}
