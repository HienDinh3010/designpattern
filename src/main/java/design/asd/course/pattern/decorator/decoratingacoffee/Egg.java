package design.asd.course.pattern.decorator.decoratingacoffee;

public class Egg extends CoffeeDecorator {

    public Egg(CoffeeComponent coffeeComponent) {
        super(coffeeComponent);
    }

    @Override
    public void description() {
        System.out.println("Egg coffee description");
    }
}
