package design.asd.course.pattern.composite.assignment.xmlparser.mediumxmlparser;

public class XMLParser {
    public XMLNode parseXMLDocument(String xmlString) {

        XMLElement rootElement = new XMLElement("root");

        rootElement.parse(xmlString);
        return rootElement;
    }
}
