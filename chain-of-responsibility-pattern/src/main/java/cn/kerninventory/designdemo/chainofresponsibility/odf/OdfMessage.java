package cn.kerninventory.designdemo.chainofresponsibility.odf;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class OdfMessage {

    private int messageType;

    private String messageName;

    public OdfMessage(int messageType, String messageName) {
        this.messageType = messageType;
        this.messageName = messageName;
    }

    public int getMessageType() {
        return messageType;
    }

    public OdfMessage setMessageType(int messageType) {
        this.messageType = messageType;
        return this;
    }

    public String getMessageName() {
        return messageName;
    }

    public OdfMessage setMessageName(String messageName) {
        this.messageName = messageName;
        return this;
    }
}
