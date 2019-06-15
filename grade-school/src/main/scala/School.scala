import scala.collection.immutable.ListMap

class School {
  type DB = Map[Int, Seq[String]]

  var _db = Map[Int, Seq[String]]().withDefaultValue(Seq())

  def add(name: String, g: Int) = {
      _db += (g -> (_db(g) :+ name))
  }

  def db: DB = _db

  def grade(g: Int): Seq[String] = db(g)

  def sorted: DB = Map(db.toSeq.sortBy(_._1).map(x => (x._1, x._2.sorted)):_*)
}
