package design.asd.course.pattern.command.calculator.with;

import design.asd.course.pattern.command.calculator.Calculator;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10);
        AddCommand addCommand = new AddCommand();
        addCommand.setCalculator(calculator);
        addCommand.setNum(5);
        addCommand.execute();

        SubtractCommand subtractCommand = new SubtractCommand();
        subtractCommand.setCalculator(calculator);
        subtractCommand.setNum(2);
        subtractCommand.execute();
    }
}
