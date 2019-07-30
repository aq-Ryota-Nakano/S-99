package lists

object P06 {
  def isPalindrome[A](ls: List[A]): Boolean = ls == ls.reverse
}
