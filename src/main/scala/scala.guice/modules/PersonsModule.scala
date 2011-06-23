package scala.guice.modules

import com.google.inject.assistedinject.FactoryModuleBuilder
import guice.interfaces.{PersonFactory, Person}
import com.google.inject.{Provides, AbstractModule}
import javax.inject.Named
import guice.Coworker

/**
 *
 * <p>
 * Created on 11-06-19
 *
 * @author leszek
 */
class PersonsModule extends AbstractModule {

  def configure() {
    install(new FactoryModuleBuilder().implement(classOf[Person], classOf[Coworker]).build(classOf[PersonFactory]))
  }

  /**
   * Another way of binding, see
   * http://code.google.com/p/google-guice/wiki/ProvidesMethods
   * We can create object, update needed information and
   * return such defined object.
   *
   * Without @Named Guice would return this String for every String parameter,
   * within given module.
   */
  @Provides
  @Named("surname")
  def getSurname = "Bond"
}