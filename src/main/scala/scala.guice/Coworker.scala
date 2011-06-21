package scala.guice

import com.google.inject.assistedinject.Assisted
import interfaces.Person
import javax.inject.{Named, Inject}

/**
 * Example of assisted inject, see
 * http://code.google.com/p/google-guice/wiki/AssistedInject
 * <p>
 * Created on 11-06-19
 *
 * @author leszek
 */
class Coworker @Inject()(@Named("surname") sname: String, @Assisted fname: String) extends Person {

  def surname = sname

  def name = fname
}