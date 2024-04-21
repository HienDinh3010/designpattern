package design.asd.course.pattern.command.calculator.with;

import design.asd.course.pattern.command.calculator.Calculator;

public class SubtractCommand implements Command {

    private Calculator calculator;

    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void execute() {
        System.out.printf("%d - %d = %d\n", calculator.getNum(), num, calculator.subtract(num));
    }
}
