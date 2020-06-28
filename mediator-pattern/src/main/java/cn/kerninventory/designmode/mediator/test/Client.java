package cn.kerninventory.designmode.mediator.test;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        User user1 = new User("Kern");
        User user2 = new User("Tom");
        User user3 = new User("Jack");
        MessageGroup messageGroup = new MessageGroup("trio");
        messageGroup.put(user1);
        messageGroup.put(user2);
        messageGroup.put(user3);
        user1.speed("trio", "大家好");
    }
}
