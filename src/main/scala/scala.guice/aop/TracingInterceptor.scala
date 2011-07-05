package scala.guice.aop

import org.aopalliance.intercept.{MethodInvocation, MethodInterceptor}

/**
 * <p>
 * Created on 11-07-04
 *
 * @author leszek
 */
class TracingInterceptor extends MethodInterceptor {

  def invoke(invocation: MethodInvocation): AnyRef = {
    try {
      println("Invoking method: " + invocation.getMethod.getName)
      invocation.proceed()
    } catch {
      case t: Throwable => t
    }
  }
}