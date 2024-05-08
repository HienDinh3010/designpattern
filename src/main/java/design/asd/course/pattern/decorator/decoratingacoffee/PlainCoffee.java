package design.asd.course.pattern.decorator.decoratingacoffee;

public class PlainCoffee implements CoffeeComponent {

    @Override
    public void description() {
        System.out.println("PlainCoffee description");
    }
}
