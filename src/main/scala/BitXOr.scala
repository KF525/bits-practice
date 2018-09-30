class BitXOr {

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

/*
Binary XOR Operator copies the bit if it is set in one operand but not both.
A =   0011 1100
B =   0000 1101
A^B = 0011 0001

so
A =   0011 1100
B =   0011 1100
A^B = 0000 0000
 */
