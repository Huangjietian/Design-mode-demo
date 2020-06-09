package cn.kerninventory.designmode.prototype;

import java.io.*;

/**
 * @author Kern
 * @date 2020/6/9 10:36
 * @description  通过序列化与反序列化实现深克隆
 */
public class SerializeClient {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);


        Prototype prototypeA = new Prototype("string", 1, 1.11d, new Quote(3));
        objectOutputStream.writeObject(prototypeA);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Prototype prototypeB = (Prototype) objectInputStream.readObject();

        prototypeB.setStr("alter");
        prototypeB.setDigit(2);
        prototypeB.setNumber(2.22d);
        prototypeB.getQuote().setNo(5);

        System.out.println(prototypeA.toString());
        System.out.println(prototypeB.toString());
    }
}
