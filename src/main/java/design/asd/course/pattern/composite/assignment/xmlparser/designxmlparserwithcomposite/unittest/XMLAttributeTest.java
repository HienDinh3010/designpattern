package design.asd.course.pattern.composite.assignment.xmlparser.designxmlparserwithcomposite.unittest;

import design.asd.course.pattern.composite.assignment.xmlparser.designxmlparserwithcomposite.XMLAttribute;
import design.asd.course.pattern.composite.assignment.xmlparser.designxmlparserwithcomposite.XMLElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XMLAttributeTest {

    private XMLAttribute xmlElement;

    @BeforeEach
    void setUp() {
        xmlElement = new XMLAttribute();
    }

    @Test
    void isValidateXMLElement() {
    }

//    @Test
//    void parseXMLElement() {
//        String xmlString = "<child1>child1 content</child1>";
//        XMLAttribute attribute = (XMLAttribute) xmlElement.parseXMLElement(xmlString);
//        assertEquals("child1", attribute.getName());
//        assertEquals("child1 content", attribute.getValue());
//    }
//
//    @Test
//    void parseXMLElements() {
//        String xmlString = "<author>Corets, Eva</author><title>Maeve Ascendant</title>";
//        XMLAttribute attribute = (XMLAttribute) xmlElement.parseXMLElement(xmlString);
//        assertEquals("author", attribute.getName());
//        assertEquals("Corets, Eva", attribute.getValue());
//    }
}