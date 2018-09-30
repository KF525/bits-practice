object BitPracticeMain extends App {

  val dupInt = new DupInt
  val integers = List(12, 21, 31, 5, 31, 5, 12)
  val duplicate = dupInt.findDuplicate(integers)
  println(duplicate)

  println(dupInt.xorExploration(12, 1))
  println(dupInt.xorExploration(12, 2))
  println(dupInt.xorExploration(37, 3))
}
