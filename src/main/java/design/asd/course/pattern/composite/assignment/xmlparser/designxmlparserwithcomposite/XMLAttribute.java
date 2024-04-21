package design.asd.course.pattern.composite.assignment.xmlparser.designxmlparserwithcomposite;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XMLAttribute extends XMLElement {

    private String value;

    public String getValue() {
        return value;
    }

    public XMLAttribute() {
        this.childAttributes = new ArrayList<>();
    }

    public XMLAttribute(String name, String value) {
        super(name);
        this.value = value;
    }

    @Override
    public boolean isValidateXMLElement(String xmlString) {
        if (xmlString.matches(XMLUtils.validXmlAttributeRegex)) {
            return true;
        }
        return false;
    }

    @Override
    public void parseXMLElements(String xmlString) {
        Pattern pattern = Pattern.compile(XMLUtils.xmlAttributesRegex);
        Matcher matcher = pattern.matcher(xmlString);
        while (matcher.find()) {
            String tagName = matcher.group(1);
            String value = matcher.group(2);
            addChildAttribute(new XMLAttribute(tagName, value));
        }
    }

//    public XMLElement parseXMLElement(String xmlString) {
//        if (isValidateXMLElement(xmlString)) {
//            Pattern pattern = Pattern.compile(XMLUtils.xmlAttributeRegex);
//            Matcher matcher = pattern.matcher(xmlString);
//            if (matcher.matches()) {
//                String name = matcher.group(1);
//                String value = matcher.group(2);
//                return new XMLAttribute(name, value);
//            }
//        }
//        return null;
//    }

    @Override
    public void addChildAttribute(XMLElement element) {
        this.childAttributes.add(element);
    }

    @Override
    public void removeChildAttribute(XMLElement element) {
        this.childAttributes.remove(element);
    }

    @Override
    public void display() {
        for (XMLElement element: childAttributes) {
            XMLAttribute attribute = (XMLAttribute) element;
            System.out.println(attribute.name + " : " + attribute.getValue());
        }
    }
}
