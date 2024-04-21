package design.asd.course.pattern.composite.transparent;

public class Leaf extends Component {
    @Override
    void doThis() {
        System.out.println("Leaf does something");
    }

    @Override
    void addElement(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    void removeElement(Component component) {
        throw new UnsupportedOperationException();
    }
}
