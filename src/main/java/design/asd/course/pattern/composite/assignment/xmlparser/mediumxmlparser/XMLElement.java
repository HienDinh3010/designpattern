package design.asd.course.pattern.composite.assignment.xmlparser.mediumxmlparser;

import java.util.ArrayList;
import java.util.List;

public class XMLElement implements XMLNode {

    private String name;

    private List<XMLAttribute> attributes;

    private List<XMLNode> children;

    public XMLElement(String name) {
        this.name = name;
        attributes = new ArrayList<>();
        children = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<XMLAttribute> getAttributes() {
        return attributes;
    }

    @Override
    public List<XMLNode> getChildren() {
        return children;
    }

    @Override
    public void parse(String xmlString) {

    }

}
