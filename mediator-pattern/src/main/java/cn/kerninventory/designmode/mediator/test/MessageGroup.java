package cn.kerninventory.designmode.mediator.test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class MessageGroup {

    private String name;

    private Map<String, User> userMap = new ConcurrentHashMap<>();

    public void put(User user) {
        userMap.put(user.getName(), user);
        user.join(this);
    }

    public void remove(User user) {
        userMap.remove(user);
        user.quit(getName());
    }

    public String getName() {
        return name;
    }

    public MessageGroup(String name) {
        this.name = name;
    }

    public void handleUserVoicing(User user, final String message) {
        userMap.values().stream().forEach(e -> e.receive(user.getName() + ": " + message));
    }
}
