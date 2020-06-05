package cn.kerninventory.designmode.simplefactory;

import com.sun.xml.internal.ws.api.ResourceLoader;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @author Kern
 * @date 2020/6/5 11:38
 * @description
 */
public class XmlUtil {

    public static String getProductType() {
        try {
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            Document document = builder.parse("D:\\respository_code\\resp_github\\design-mode-demo\\simple-factory-pattern\\src\\main\\resources\\config.xml");
            NodeList nodeList = document.getElementsByTagName("productType");
            Node node = nodeList.item(0).getFirstChild();
            return node.getNodeValue().trim();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
