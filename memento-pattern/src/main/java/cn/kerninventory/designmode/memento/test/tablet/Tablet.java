package cn.kerninventory.designmode.memento.test.tablet;

import cn.kerninventory.designmode.memento.test.TabletMementoHolder;
import lombok.SneakyThrows;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1>中文注释</h1>
 * <p>
 *     写字板
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public class Tablet implements Cloneable, Serializable {
    private TabletMementoHolder mementoHolder = new TabletMementoHolder();
    private StringBuilder chars = new StringBuilder();

    private int undoTime = 0;
    public Tablet() {
        mementoHolder.setOriginal(new TabletMemento((Tablet) clone()));
    }

    public StringBuilder getChars() {
        return chars;
    }

    private void print(){
        System.out.println();
        System.out.println();
        System.out.println(getChars());
    }

    public void write(String text) {
        chars.append(text);
        save();
        undoTime = 0;
    }

    private void save() {
        Tablet tablet = (Tablet) clone();
        mementoHolder.push(new TabletMemento(tablet));
        print();
    }

    public void undo() {
        if (undoTime == 0) {
            mementoHolder.pop();
        }
        this.chars = mementoHolder.pop().getTablet().getChars();
        undoTime++;
        print();
    }

    public void reset(){
        undoTime = 0;
        this.chars = mementoHolder.getOriginal().getTablet().getChars();
        System.out.println("已重置");
        print();
    }

    @SneakyThrows
    @Override
    protected Object clone() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Tablet prototype = (Tablet) objectInputStream.readObject();
        return prototype;
    }
}
