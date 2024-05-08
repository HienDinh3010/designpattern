package design.asd.course.pattern.decorator.decoratingacoffee;

public class Application {
    public static void main(String[] args) {
        Milk milkCoffee = new Milk(new PlainCoffee());
        milkCoffee.description();

        Egg eggCoffee = new Egg(new Milk(new PlainCoffee()));
        eggCoffee.description();
    }
}
