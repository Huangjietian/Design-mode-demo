package cn.kerninventory.designdemo.chainofresponsibility.odf;

import java.lang.annotation.*;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Sort {

    int value();

}
