package com.mywms.ui.jqgrid;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author c_jyin
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target( { ElementType.FIELD, ElementType.METHOD })
public @interface JQGridColumn {
	/**
	 * (Optional) refer to ColModel.width
	 */
	int order();

	/**
	 * (Optional) refer to ColModel.name
	 */
	String name() default "";

	/**
	 * (Optional) refer to ColModel.index
	 */
	String index() default "";

	/**
	 * (Optional) refer to ColModel.align
	 */
	String align() default "";

	/**
	 * (Optional) refer to ColModel.width
	 */
	int width();
}
