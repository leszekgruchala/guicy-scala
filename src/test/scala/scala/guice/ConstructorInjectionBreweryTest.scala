package scala.guice

import interfaces.Water
import modules.AnotherBreweryModule

/**
 * Test class for constructor based injections.
 * <p>
 * Created on 11-06-15
 *
 * @author leszek
 */
class ConstructorInjectionBreweryTest extends CoreTests[ConstructorBasedBrewery, AnotherBreweryModule] {

  "A dependency injector" should {
    "guarantee Water to be Singleton" in new Waters {
      instance must beEqualTo(instance2)
    }
    "produce same instances of Water for instance based on different service" in new VariousWaters {
      instance aka "interface based instance" must be equalTo (implInstance)
    }
    "blend what must be blended" in new Injector {
      injectedClass.asInstanceOf[ConstructorBasedBrewery].blend("James")
    }
  }

  /**
   * Getting instances works without @Inject annotation,
   * because there is default (no arguments) constructor.
   */
  trait Waters extends Injector {

    val instance = injector.getInstance(classOf[Water])
    val instance2 = injector.getInstance(classOf[Water])
  }

  /**
   * Interface and implementation based instances are the same,
   * because both are scoped as Singletons.
   */
  trait VariousWaters extends Waters {

    val implInstance = injector.getInstance(classOf[SpringWater])
  }

}