package scala.guice

import org.specs2.specification.Scope
import org.specs2.mutable.Specification
import com.google.inject.{Module, Guice}

/**
 * Base tests for given test class and module.
 * <p>
 * Created on 11-06-16
 *
 * @author leszek
 */
class CoreTests[T, M <: Module](implicit val testClass: Manifest[T], implicit val module: Manifest[M]) extends
Specification {

  "A dependency injector" should {
    "produce all needed instances" in new Injector {
      /**
       * The semi-colon must be here, see
       * https://groups.google.com/forum/#!topic/specs2-users/mxUE3Ovxnoo
       */
      injector must not beNull;
      injectedClass must beAnInstanceOf[T]
    }
  }

  /**
   * Prepares new setup for each test
   */
  trait Injector extends Scope {

    val injector = Guice.createInjector(module.erasure.newInstance().asInstanceOf[M])
    val injectedClass = injector.getInstance(testClass.erasure).asInstanceOf[T]
  }

}