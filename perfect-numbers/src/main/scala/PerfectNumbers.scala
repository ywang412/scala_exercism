import NumberType.NumberType

object NumberType extends Enumeration {
  type NumberType = Value

  val Perfect = Value(0)
  val Abundant = Value(1)
  val Deficient = Value(-1)
}


object PerfectNumbers {
  def classify(x: Int) : Either[String, NumberType] = {
    if (x < 1) Left("Classification is only possible for natural numbers.")
    else  Right(NumberType((1 to x/2).filter(x % _ == 0).sum.compare(x)))
  }
}

