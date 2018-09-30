import org.scalatest.{FlatSpec, Matchers}

class DupIntSpec extends FlatSpec with Matchers {

  val dupInt = new DupInt

  "findDuplicate" should "return the duplicate integer" in {
    val integers = List(12, 21, 31, 5, 31, 5, 12)

    dupInt.findDuplicate(integers) shouldBe 21
  }

  it should "return 0 if there is no duplicate" in {
    val integers = List(12, 31, 5, 31, 5, 12)

    dupInt.findDuplicate(integers) shouldBe 0
  }

  "xorExploration" should "" in {
    dupInt.xorExploration(12, 2) shouldBe 0
    dupInt.xorExploration(12, 1) shouldBe 12
  }
}
