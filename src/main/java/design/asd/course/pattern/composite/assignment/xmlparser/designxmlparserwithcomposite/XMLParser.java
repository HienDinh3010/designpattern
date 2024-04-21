package design.asd.course.pattern.composite.assignment.xmlparser.designxmlparserwithcomposite;

public class XMLParser {
    public XMLElement parseXML(String xmlString) {
        String rootName = XMLUtils.getParentNodeName(xmlString);
        XMLNode root = new XMLNode(rootName);

        String removeParentNode = XMLUtils.removeParentNode(xmlString);
        //root node has a list of attribute
        if (XMLUtils.isXMLAttribute(removeParentNode)) {
            XMLAttribute xmlAttribute = new XMLAttribute();
            xmlAttribute.parseXMLElements(removeParentNode);
            root.addChildAttribute(xmlAttribute);
        } else {//root node contains sub nodes
            XMLNode xmlNode = new XMLNode(XMLUtils.getParentNodeName(removeParentNode));
            xmlNode.parseXMLElements(removeParentNode);
            root.addXMLNode(xmlNode);
        }

        return root;
    }
}
