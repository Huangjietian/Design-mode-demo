package cn.kerninventory.designmode.mediator;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public abstract class Mediator {

    private Map<String, Colleague> colleagueMap = new ConcurrentHashMap<>(16);

    public void put(String name, Colleague colleague) {
        /**
         * 中介者类与同事类互为引用
         */
        colleague.setMediator(this);
        colleagueMap.put(name, colleague);
    }

    public void remove(String name) {
        colleagueMap.remove(name);
    }

    public abstract void operate();
}
