package scala.guice.modules

import com.google.inject.AbstractModule
import guice.interfaces.{Malt, Water, Hops}
import javax.inject.Singleton
import guice.{BitterMalt, SpringWater, GreenHops}

/**
 *
 * <p>
 * Created on 11-06-11
 *
 * @author leszek
 */
class AnotherBreweryModule extends AbstractModule {

  override def configure() {
    install(new PersonsModule)

    bind(classOf[Hops]).to(classOf[GreenHops])
    bind(classOf[Water]).to(classOf[SpringWater]).in(classOf[Singleton])
    bind(classOf[SpringWater]).in(classOf[Singleton])
    bind(classOf[Malt]).to(classOf[BitterMalt])
  }

}