package design.asd.course.pattern.composite.assignment.xmlparser.designxmlparserwithcomposite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XMLUtilsTest extends XMLUtils {

    private String xmlString = "<root><child1><child1sub1>child1sub1 value</child1sub1><child1sub2>child1sub2 value</child1sub2></child1><child2>child2 content</child2><child3><child3sub1><child3sub1inner1>I'm done</child3sub1inner1></child3sub1></child3></root>";

    private String xmlAttributesString = "<child1sub1>child1sub1 value</child1sub1><child1sub2>child1sub2 value</child1sub2>";
    @Test
    void testRemoveParentNode() {
        String actual = XMLUtils.removeParentNode(xmlString);
        assertEquals("<child1><child1sub1>child1sub1 value</child1sub1><child1sub2>child1sub2 value</child1sub2></child1><child2>child2 content</child2><child3><child3sub1><child3sub1inner1>I'm done</child3sub1inner1></child3sub1></child3>", actual);
    }

    @Test
    void testGetParentNodeName() {
        String actual = XMLUtils.getParentNodeName(xmlString);
        assertEquals("root", actual);
    }


    @Test
    void testIsXMLAttribute() {
        boolean actual = XMLUtils.isXMLAttribute(xmlAttributesString);
        assertEquals(true, actual);
    }
}