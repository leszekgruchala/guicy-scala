package scala.guice

import aop.InterceptMe
import interfaces.{Hops, Water, Malt}
import javax.inject.Inject

/**
 *
 * <p>
 * Created on 11-06-15
 *
 * @author leszek
 */
class SetterBasedBrewery {

  /**
   * Used Option to avoid null
   */
  private var malt: Option[Malt] = None

  /**
   * Initialized with default value which is null
   */
  private var water: Water = _

  private var hops: Option[Hops] = None

  @Inject
  def setMalt(malt: Malt) {
    this.malt = Some(malt)
  }

  @InterceptMe
  @Inject
  def setWater(water: Water) {
    this.water = water
  }

  @Inject
  def setHops(hops: Hops) {
    this.hops = Some(hops)
  }

}