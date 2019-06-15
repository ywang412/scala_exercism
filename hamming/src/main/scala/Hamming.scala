object Hamming {

  def distance(a: String, b: String): Option[Int] = {

    (a, b) match {
      case (a, b) if a.length == b.length => Some((0 until a.length.min(b.length)).count(i => a(i) != b(i)))
      case _ => None
    }

  }

}