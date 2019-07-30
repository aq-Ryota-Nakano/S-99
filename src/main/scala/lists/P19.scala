package lists

object P19 {
  def rotate[A](n: Int, ls: List[A]): List[A] = {
    val nBounded = if (ls.isEmpty) 0 else n % ls.length // 事前の処理
    if (nBounded < 0) rotate(nBounded + ls.length, ls) // 事前の処理
    else (ls drop nBounded) ::: (ls take nBounded) // メインの処理
  }
}
