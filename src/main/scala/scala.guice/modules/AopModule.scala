package scala.guice.modules

import com.google.inject.AbstractModule
import com.google.inject.matcher.Matchers
import guice.aop.{TracingInterceptor, InterceptMe}

/**
 * <p/>
 * Created on 11-07-05
 *
 * @author leszek
 */
class AopModule extends AbstractModule {

  override protected def configure {
    bindInterceptor(Matchers.any, Matchers.annotatedWith(classOf[InterceptMe]), new TracingInterceptor)
  }
}