package cn.kerninventory.designmode.flyweight;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Network network = new Network();
        ConnectionType connectionType1 = network.getConnectionType(1);
        connectionType1.link("192.168.1.2");
        ConnectionType connectionType2 = network.getConnectionType(1);
        connectionType2.link("192.168.1.3");
        ConnectionType connectionType3 = network.getConnectionType(2);
        connectionType3.link("192.168.1.4");

        System.out.println(connectionType1 == connectionType2);
        System.out.println(connectionType1 == connectionType3);
        System.out.println(connectionType2 == connectionType3);
    }
}
