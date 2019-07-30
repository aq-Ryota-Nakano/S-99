def mMatch(s: String) = {
  val target: String = "a"
  s match {
    case `target` => println("It was" + target)
    case _ => println("It was something else")
  }
}

mMatch("a")