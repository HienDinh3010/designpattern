package design.asd.course.pattern.composite.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * All components have the same interface:
 * The client does not need to check if it is a Composite or Leaf
 */
public class Composite extends Component {

    private List<Component> components = new ArrayList<>();

    @Override
    void doThis() {
        components.forEach(c -> System.out.println("A composite does something"));
    }

    @Override
    void addElement(Component component) {
        components.add(component);
    }

    @Override
    void removeElement(Component component) {
        components.remove(component);
    }
}
