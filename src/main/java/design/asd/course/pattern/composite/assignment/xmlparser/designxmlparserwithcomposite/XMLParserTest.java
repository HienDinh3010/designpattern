package design.asd.course.pattern.composite.assignment.xmlparser.designxmlparserwithcomposite;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XMLParserTest extends XMLUtils {

    private XMLParser xmlParser = new XMLParser();

    private String xmlString = "<root><child1><child1sub1>child1sub1 value</child1sub1><child1sub2>child1sub2 value</child1sub2></child1><child2>child2 content</child2><child3><child3sub1><child3sub1inner1>I'm done</child3sub1inner1></child3sub1></child3></root>";

    private String xmlString0 = "<root><child1sub1>child1sub1 value</child1sub1><child1sub2>child1sub2 value</child1sub2></root>";

    @Test
    void parseXML() {
        XMLElement root = xmlParser.parseXML(xmlString0);
        XMLAttribute attribute = (XMLAttribute) root.childAttributes.get(0);
        assertEquals("child1sub1", attribute.getName());
        assertEquals("child1sub1 value", attribute.getValue());

        XMLAttribute attribute2 = (XMLAttribute) root.childAttributes.get(1);
        assertEquals("child1sub2", attribute.getName());
        assertEquals("child1sub2 value", attribute.getValue());
    }
}