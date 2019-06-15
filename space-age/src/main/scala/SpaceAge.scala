import scala.language.dynamics

object SpaceAge extends Dynamic {
  private val SecondsPerEarthYear = 31557600.0
  private val OrbitalPeriodRatio = Map(
    ("mercury", 0.2408467),
    ("venus", 0.61519726),
    ("mars", 1.8808158),
    ("jupiter", 11.862615),
    ("saturn", 29.447498),
    ("uranus", 84.016846),
    ("neptune", 164.79132)
  )

  def applyDynamic(name: String)(seconds: Double): Double =
    if (name == "onEarth") seconds / SecondsPerEarthYear
    else this.onEarth(seconds) / OrbitalPeriodRatio(name.drop(2).toLowerCase)
}