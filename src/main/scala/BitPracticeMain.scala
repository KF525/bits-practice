object BitPracticeMain extends App {

  val bitXor = new BitXOr
  val integers = List(12, 21, 31, 5, 31, 5, 12)
  val duplicate = bitXor.findDuplicate(integers)
  println(duplicate)

  println(bitXor.xorExploration(12, 1))
  println(bitXor.xorExploration(12, 2))
  println(bitXor.xorExploration(37, 3))

  val bitInsertion = new BitInsertion
  bitInsertion.insertNIntoM(
    Integer.parseInt("1000000000000", 2),
    Integer.parseInt("10011", 2), 2, 6)
}
