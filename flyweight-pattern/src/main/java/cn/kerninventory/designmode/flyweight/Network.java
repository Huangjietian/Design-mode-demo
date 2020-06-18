package cn.kerninventory.designmode.flyweight;

import java.util.HashMap;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Network {

    private  HashMap<Integer, ConnectionType> connectionTypeHashMap;

     public Network(){
        connectionTypeHashMap = new HashMap<>(16);
        connectionTypeHashMap.put(1, new WiredConnectionType());
        connectionTypeHashMap.put(2, new WirelessConnectionType());
    }

    public ConnectionType getConnectionType(int type) {
        ConnectionType connectionType = connectionTypeHashMap.get(type);
        if (connectionType == null) {
            throw new IllegalArgumentException("不支持当前方式的连接");
        }
        return connectionType;
    }


}
