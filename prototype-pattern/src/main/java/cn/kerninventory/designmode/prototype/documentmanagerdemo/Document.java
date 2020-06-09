package cn.kerninventory.designmode.prototype.documentmanagerdemo;

import lombok.Data;

/**
 * @author Kern
 * @date 2020/6/9 10:47
 * @description
 */
@Data
public class Document implements Cloneable {

    public Document(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public Document clone() throws CloneNotSupportedException {
        Document document = (Document) super.clone();
        //如果有引用对象，需要继续进行Cloneable接口的实现，并在此处进行引用对象的clone实现
        return document;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                "hashcode=" + this.hashCode() +
                '}';
    }
}
