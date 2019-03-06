package com.logsentinel.sentineldb.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.logsentinel.sentineldb.model.SearchSchemaField.VisibilityLevelEnum;

/**
 * Annotation used to mark fields that should be included in a search schema 
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SchemaField {
    boolean indexed() default true;
    boolean analyzed() default false;
    VisibilityLevelEnum visibility() default VisibilityLevelEnum.PUBLIC;
}
