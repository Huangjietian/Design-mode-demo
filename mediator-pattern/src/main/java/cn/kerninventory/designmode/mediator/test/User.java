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
public class User {

    private String name;

    public String getName() {
        return name;
    }

    private Map<String, MessageGroup> groupMap = new ConcurrentHashMap<>();

    public void join(MessageGroup messageGroup) {
        groupMap.put(messageGroup.getName(), messageGroup);
    }

    public void quit(String name) {
        groupMap.remove(name);
    }

    public void receive(String message) {
        System.out.println(getName() + " receive : " + message);
    }

    public  void speed(String name, String message) {
        MessageGroup group = groupMap.get(name);
        if (group != null) {
            group.handleUserVoicing(this, message);
        } else {
            System.out.println("查无此群");
        }
    }

    public User(String name) {
        this.name = name;
    }


}
