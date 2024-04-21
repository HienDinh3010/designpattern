package design.asd.course.pattern.composite.transparent;

import org.xml.sax.XMLReader;

import javax.sql.rowset.spi.XmlWriter;
import javax.xml.parsers.DocumentBuilderFactory;

public abstract class Component {
    abstract void doThis();
    abstract void addElement(Component component);

    abstract void removeElement(Component component);
}
