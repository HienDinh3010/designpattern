package design.asd.course.pattern.decorator.decoratingacoffee;

public class Milk extends CoffeeDecorator {

    public Milk(CoffeeComponent coffeeComponent) {
        super(coffeeComponent);
    }

    @Override
    public void description() {
        System.out.println("Milk coffee description");
    }
}
