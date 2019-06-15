object Etl {

  def transform(oldScore: Map[Int, Seq[String]]): Map[String, Int] = {

    for {
      (score, letters) <- oldScore
      letter <- letters
    }
      yield (letter.toLowerCase, score)

  }
}