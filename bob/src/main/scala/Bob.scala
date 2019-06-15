object Bob {
  def response(statement: String): String = {
    statement match {
      case msg if msg.trim.length() == 0 => "Fine. Be that way!"
      case msg if msg.forall(!_.isLetter) && msg.endsWith("?") => "Sure."
      case msg if msg == msg.toUpperCase() && msg.endsWith("?") => "Calm down, I know what I'm doing!"
      case msg if msg.forall(!_.isLetter) => "Whatever."
      case msg if msg.trim.endsWith("?") => "Sure."
      case msg if msg == msg.toUpperCase() => "Whoa, chill out!"
      case _ => "Whatever."
    }

  }
}
