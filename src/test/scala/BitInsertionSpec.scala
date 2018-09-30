import org.scalatest.{FlatSpec, Matchers}

class BitInsertionSpec extends FlatSpec with Matchers {
  val bitInsertion = new BitInsertion

  "insertNIntoM" should "correctly insert a subset of bits" in {
    val result = bitInsertion.insertNIntoM(Integer.parseInt("1000000000000", 2),
        Integer.parseInt("10011", 2), 2, 6)
    result.toBinaryString shouldBe "1000001001100"
  }
}
