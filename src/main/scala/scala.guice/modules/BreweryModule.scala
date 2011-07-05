package scala.guice.modules

import com.google.inject.AbstractModule
import javax.inject.Singleton
import guice.{BitterMalt, SpringWater, GreenHops}
import guice.interfaces.{Malt, Water, Hops}

/**
 *
 * <p>
 * Created on 11-06-11
 *
 * @author leszek
 */
class BreweryModule extends AbstractModule {

  override def configure() {
    install(new AopModule)
    bind(classOf[Hops]).to(classOf[GreenHops])
    bind(classOf[Water]).to(classOf[SpringWater])
    bind(classOf[Malt]).to(classOf[BitterMalt]).in(classOf[Singleton])
  }

}