package cn.edu.gdut.zaoying.Option.series.pie.labelLine.emphasis.lineStyle;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface TypeString {
    String value() default "";
}