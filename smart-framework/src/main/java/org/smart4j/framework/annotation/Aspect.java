package org.smart4j.framework.annotation;

import java.lang.annotation.*;

/**
 * Created by wybe on 2018/4/11.
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {

    Class<? extends Annotation> value();
}
