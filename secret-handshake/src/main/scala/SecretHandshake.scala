object SecretHandshake {

  val flags = Map(
    1 -> "wink",
    2 -> "double blink",
    4 -> "close your eyes",
    8 -> "jump"
  )

  def commands(x: Int) : List[String] = {
    val res = flags.foldLeft(List[String]())((acc, pair) =>
      if ((x & pair._1) > 0) acc :+ pair._2
      else acc
    )

    if ((x>>4 & 1) > 0) res.reverse
    else res
  }
}