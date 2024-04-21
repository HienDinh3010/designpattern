package design.asd.course.pattern.command.calculator.without;

import design.asd.course.pattern.command.calculator.Calculator;

/**
 * A calculator without using Command Pattern.
 * It is so simple here why we need to apply Command Pattern for such this simple thing.
 * That is because we want to do certain things, other things for each command add or subtract.
 */
public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10);
        System.out.println(calculator.add(5));
        System.out.println(calculator.subtract(2));
    }
}
