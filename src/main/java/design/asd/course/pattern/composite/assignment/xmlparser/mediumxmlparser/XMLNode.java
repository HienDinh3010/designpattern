package design.asd.course.pattern.composite.assignment.xmlparser.mediumxmlparser;

import java.util.List;

public interface XMLNode {
    String getName();
    List<XMLAttribute> getAttributes();
    List<XMLNode> getChildren();

    void parse(String xmlString);
}
