package scala.guice

import interfaces.Malt
import modules.BreweryModule

/**
 * Test class for setter based injections.
 * <p>
 * Created on 11-06-16
 *
 * @author leszek
 */
class SetterInjectionBreweryTest extends CoreTests[SetterBasedBrewery, BreweryModule] {

  "A dependency injector" should {
    "guarantee Malt to be Singleton" in new Malts {
      instance must beEqualTo(instance2)
    }
    "produce different instances of Malt for instance based on different service" in new VariousMalts {
      instance aka "interface based instance" must not be equalTo(implInstance)
    }
  }

  /**
   * Getting instances works without @Inject annotation,
   * because there is default (no arguments) constructor.
   */
  trait Malts extends Injector {

    val instance = injector.getInstance(classOf[Malt])
    val instance2 = injector.getInstance(classOf[Malt])
  }

  /**
   * Only Malt in BreweryModule is scoped as Singleton,
   * so all other descendants will produce new instances
   * from the same injector.
   */
  trait VariousMalts extends Malts {

    val implInstance = injector.getInstance(classOf[BitterMalt])
  }


}