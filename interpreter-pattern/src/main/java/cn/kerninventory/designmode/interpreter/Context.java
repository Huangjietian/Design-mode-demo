package cn.kerninventory.designmode.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Context {

    /**
     * 存储了全局变量
     *
     * 临时存储需要解释的语句
     */
    private Map configMap = new HashMap();
    private String text;
}
