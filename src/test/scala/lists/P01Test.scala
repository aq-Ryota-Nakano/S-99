package lists

import org.scalatest.FunSuite

class P01Test extends FunSuite {
  val l = List(1, 1, 2, 3, 5, 8)

  test("recursion") {
    val act = P01.recursion(l)
    assert(act == 8)
  }

  test("testRecursive") {
    val act = P01.lastRecursive(l)
    assert(act == 8)
  }
}
