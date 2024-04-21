package design.asd.course.pattern.composite.safecomposite;

import java.util.List;

/**
 * 1. Only the composite has methods to add or remove elements
 * 2. Components do not have the same interface: The client needs to check if it is a Composite or Leaf
 */
public class Composite extends Component {

    private List<Component> components;

    public void addElement(Component component) {
        components.add(component);
    }

    public void removeElement(Component component) {
        components.remove(component);
    }

    @Override
    public void doThis() {
        components.forEach(component -> component.doThis());
    }
}
