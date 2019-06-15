object SumOfMultiples {
  def sum(factors: Set[Int], limit: Int): Int = {

    factors.map(x => Stream.range(1, limit / x + 1).map(_ * x).takeWhile(_ < limit).toList).flatMap(x => x).sum

  }
}

