package cn.kerninventory.designmode.prototype.documentmanagerdemo;

import javax.print.Doc;

/**
 * @author Kern
 * @date 2020/6/9 11:01
 * @description
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        DocumentManager documentManager = new DocumentManager(1);
        documentManager.putDocumentTemplate(1, new Document("工作日报模板"));
        Document document = documentManager.copyTemplate(1);
        document.setName("小明20200609工作日报");

        Document template = documentManager.getDocumentTemplate(1);

        System.out.println(document.toString());
        System.out.println(template.toString());
    }
}
