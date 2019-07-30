package lists

import org.scalatest.FunSuite

class P02Test extends FunSuite {

  test("testNextLastRecursive") {
    val l = List(1, 1, 2, 3, 5, 8)
    val act = P02.nextLastRecursive(l)
    assert(act == 5)
  }

}
