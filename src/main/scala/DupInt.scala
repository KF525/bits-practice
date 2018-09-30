class DupInt {
  val integers = List(12, 21, 31, 5, 31, 5, 12)

  def findDuplicate(ints: List[Int], duplicate: Int = 0): Int = ints match {
    case Nil => duplicate
    case h::t =>
      findDuplicate(t, duplicate^h)
  }

  def xorExploration(num: Int, timesToXOr: Int, xOr: Int = 0): Int =
    timesToXOr match {
      case 0 => xOr
      case _ => xorExploration(num, timesToXOr - 1, xOr^num)
    }
}
