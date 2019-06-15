import org.scalatest.{Matchers, FunSuite}

/** @version 1.2.0 */
class SecretHandshakeTest extends FunSuite with Matchers {

  test("reverse two actions") {
    
    SecretHandshake.commands(19) should be (List("double blink", "wink"))
  }

  test("reversing one action gives the same action") {
    
    SecretHandshake.commands(24) should be (List("jump"))
  }

  test("reversing no actions still gives no actions") {
    
    SecretHandshake.commands(16) should be (List())
  }

  test("all possible actions") {
    
    SecretHandshake.commands(15) should be (List("wink", "double blink", "close your eyes", "jump"))
  }

  test("reverse all possible actions") {
    
    SecretHandshake.commands(31) should be (List("jump", "close your eyes", "double blink", "wink"))
  }

  test("do nothing for zero") {
    
    SecretHandshake.commands(0) should be (List())
  }
}
