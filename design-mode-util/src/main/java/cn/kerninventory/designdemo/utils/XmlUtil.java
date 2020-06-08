package cn.kerninventory.designdemo.utils;

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

    private static final String configXmlFileLocaltion = "D:\\respository_code\\resp_github\\design-mode-demo\\design-mode-util\\src\\main\\resources\\config.xml";

    private static Document documentConfig;

    static {
        try {
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            Document document = builder.parse(configXmlFileLocaltion);
            documentConfig = document;
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getSimpleFactoryPatternProductType() {
        return getXmlConfigElement("productType");
    }

    private static String getXmlConfigElement(String tagName) {
        NodeList nodeList = documentConfig.getElementsByTagName(tagName);
        Node node = nodeList.item(0).getFirstChild();
        return node.getNodeValue().trim();
    }


    public static String getFactoryMethodPatternFactoryName() {
        return getXmlConfigElement("factoryType");
    }
}
