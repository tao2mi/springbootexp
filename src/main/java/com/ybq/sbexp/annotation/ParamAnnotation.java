package com.ybq.sbexp.annotation;

import java.lang.annotation.*;

/**
 * @author yangb
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ParamAnnotation {

    String[] value();

}
