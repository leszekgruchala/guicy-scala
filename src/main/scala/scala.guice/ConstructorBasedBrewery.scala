package scala.guice

import interfaces._
import javax.inject.Inject

/**
 *
 * <p>
 * Created on 11-06-11
 *
 * @author leszek
 */
class ConstructorBasedBrewery @Inject()(hops: Hops, water: Water, malt: Malt,
                                        personFactory: PersonFactory) extends BreweryResponsibilities {

  def blend(who: String) {
    val person = personFactory.get(who)
    println("Blending by " + person.name + " " + person.surname)
  }
}