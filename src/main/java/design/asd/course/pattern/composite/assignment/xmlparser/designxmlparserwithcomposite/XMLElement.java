package design.asd.course.pattern.composite.assignment.xmlparser.designxmlparserwithcomposite;

import java.util.List;

public abstract class XMLElement {

    protected String name;

    protected List<XMLElement> childAttributes;

    public XMLElement() {
    }

    public XMLElement(String name) {
        this.name = name;
    }

    public abstract boolean isValidateXMLElement(String xmlString);

    public abstract void parseXMLElements(String xmlString);

    public List<XMLElement> getChildAttributes() {
        return childAttributes;
    }

    public String getName() {
        return name;
    }

    public abstract void addChildAttribute(XMLElement element);

    public abstract void removeChildAttribute(XMLElement element);

    public abstract void display();
}
