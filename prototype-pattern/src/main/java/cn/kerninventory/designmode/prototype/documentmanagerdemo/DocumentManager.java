package cn.kerninventory.designmode.prototype.documentmanagerdemo;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author Kern
 * @date 2020/6/9 10:47
 * @description
 */
public class DocumentManager {

    private Hashtable<Integer, Document> templateRecords;

    public DocumentManager(int expectedCapacity) {
        this.templateRecords = new Hashtable<>(expectedCapacity);
    }

    public void putDocumentTemplate(int no, Document documentTemplate) {
        this.templateRecords.put(no, documentTemplate);
    }

    public void removeDocumentTemplate(int no) {
        this.templateRecords.remove(no);
    }

    public Document getDocumentTemplate(int no) {
        return this.templateRecords.get(no);
    }

    public Document copyTemplate(int no) throws CloneNotSupportedException {
        Document document = templateRecords.get(no);
        if (document == null) {
            throw new IllegalArgumentException("No document numbered " + no + " was found");
        }
        return document.clone();
    }
}
