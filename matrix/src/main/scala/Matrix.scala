case class Matrix (input: String){
  val rows = input.lines.map(_.split(" ").map(_.toInt).toVector).toVector
  val columns = rows.transpose

  def row(r : Int) = rows(r)
  def column(c : Int) = columns(c)

}