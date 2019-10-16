package coderpads

import org.scalacheck.util.Testable
import org.scalatest.{FunSuite, Matchers}

object Solution extends App {
  new Testable().execute();
}
class Testable extends FunSuite with Matchers {

  test("check boolean") {
    assert(true, "boolean value is true")
  }

  test("compare numbers") {
    assert(2 === 2)
  }

  test("compare lists") {
    assert(Seq(1, 2, 3) === Seq(1,2,3))
  }

}

