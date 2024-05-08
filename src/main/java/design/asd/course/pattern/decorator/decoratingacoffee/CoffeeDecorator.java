package design.asd.course.pattern.decorator.decoratingacoffee;

public class CoffeeDecorator implements CoffeeComponent {

    private CoffeeComponent coffeeComponent;

    public CoffeeDecorator(CoffeeComponent coffeeComponent) {
        this.coffeeComponent = coffeeComponent;
    }

    @Override
    public void description() {

    }
}
