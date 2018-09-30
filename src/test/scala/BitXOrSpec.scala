import org.scalatest.{FlatSpec, Matchers}

class BitXOrSpec extends FlatSpec with Matchers {

  val bitXOr = new BitXOr

  "findDuplicate" should "return the duplicate integer" in {
    val integers = List(12, 21, 31, 5, 31, 5, 12)

    bitXOr.findDuplicate(integers) shouldBe 21
  }

  it should "return 0 if there is no duplicate" in {
    val integers = List(12, 31, 5, 31, 5, 12)

    bitXOr.findDuplicate(integers) shouldBe 0
  }

  "xorExploration" should "" in {
    bitXOr.xorExploration(12, 2) shouldBe 0
    bitXOr.xorExploration(12, 1) shouldBe 12
  }
}
