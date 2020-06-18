package cn.kerninventory.designmode.flyweight;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class WiredConnectionType implements ConnectionType {

    private int connectionNumber = 0;

    @Override
    public void link(String ip) {
        connectionNumber++;
        System.out.println("有限连接， IP：" + ip);
        System.out.println("连接数量: " + connectionNumber);
    }
}
