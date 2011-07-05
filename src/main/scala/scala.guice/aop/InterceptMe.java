package scala.guice.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * There is no support for runtime annotation in Scala, so far
 * Java interfaces need to be used.
 * <p/>
 * Created on 11-07-04
 *
 * @author leszek
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface InterceptMe {

}
