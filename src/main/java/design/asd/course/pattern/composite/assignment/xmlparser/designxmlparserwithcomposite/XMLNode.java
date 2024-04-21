package design.asd.course.pattern.composite.assignment.xmlparser.designxmlparserwithcomposite;

import java.util.ArrayList;
import java.util.List;

public class XMLNode extends XMLElement {

    private List<XMLNode> childNodes;

    public List<XMLNode> getChildNodes() {
        return childNodes;
    }

    public XMLNode() {
    }

    public XMLNode(String name) {
        super(name);
        this.childAttributes = new ArrayList<>();
        this.childNodes = new ArrayList<>();
    }

    @Override
    public boolean isValidateXMLElement(String xmlString) {
        //TODO: Validate later
        return true;
    }

    @Override
    public void parseXMLElements(String xmlString) {

    }

    @Override
    public void addChildAttribute(XMLElement element) {
        this.childAttributes.add(element);
    }

    @Override
    public void removeChildAttribute(XMLElement element) {
        this.childAttributes.remove(element);
    }

    public void addXMLNode(XMLNode node) {
        this.childAttributes.add(node);
    }

    public void removeXMLNode(XMLNode node) {
        this.childAttributes.remove(node);
    }

    @Override
    public void display() {
        System.out.println("Node Name: " + name);
        if (!this.childAttributes.isEmpty()) {
            childAttributes.forEach(attribute -> attribute.display());
        }
        if (!this.childNodes.isEmpty()) {
            for (XMLNode node: childNodes) {
                System.out.println("Child node name: " + node.name);
                for (XMLElement element: node.getChildAttributes()) {
                    if (element instanceof XMLAttribute) {
                        XMLAttribute attribute = (XMLAttribute) element;
                        System.out.println(attribute.name + " : " + attribute.getValue());
                    }
                }
            }
        }
    }
}
