package scala.guice.interfaces

/**
 *
 * <p>
 * Created on 11-06-19
 *
 * @author leszek
 */
trait PersonFactory {

  def get(name: String): Person
}