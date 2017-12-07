package com.hubspot.httpql.jersey;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.hubspot.httpql.QuerySpec;

/**
 * @deprecated Use {@code com.hubspot.httpql.jersey1.BindQuery} from httpql-jersey1 instead.
 */
@Deprecated
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface BindQuery {
  Class<? extends QuerySpec> value();
}