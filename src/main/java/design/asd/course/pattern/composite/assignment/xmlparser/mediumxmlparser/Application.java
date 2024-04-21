package design.asd.course.pattern.composite.assignment.xmlparser.mediumxmlparser;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Application {

//    public static void main(String[] args) {
//        XMLParser parser = new XMLParser();
//        //XMLElement document = (XMLElement) parser.parseXMLDocument("<root><child1 attr1=\"value1\">child1 content</child1><child2 attr2=\"value2\">child2 content</child2></root>");
//        XMLElement document = (XMLElement) parser.parseXMLDocument("<root>\n" +
//                "\t<child1>child1 content</child1>\n" +
//                "\t<child2>child2 content</child2>\n" +
//                "</root>");
//        System.out.println("Root element name: " + document.getName());
//        for (XMLNode child: document.getChildren()) {
//            System.out.println("Child element name: " + child.getName());
//
//            for (XMLAttribute attribute: child.getAttributes()) {
//                System.out.println("Attribute name: " + attribute.getName());
//                System.out.println("Attribute value: " + attribute.getValue());
//            }
//
//            System.out.println("Child element content: " + child.getChildren().get(0).getName());
//        }
//    }

    public static void main(String[] args) {
        try {
            parse();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }

    public static void parse() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setValidating(true);
        factory.setIgnoringElementContentWhitespace(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        File file = new File("src/design/asd/course/pattern/composite/assignment/xmlparser/mediumxmlparser/resource/xmlfile/library.xml");
        Document doc = builder.parse(file);
        // Do something with the document here.
        //doc.getElementById("catalog").getAttributeNode("book").getAttributes().
        System.out.println();
    }
}
