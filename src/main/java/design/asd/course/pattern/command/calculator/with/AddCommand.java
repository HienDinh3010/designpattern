package design.asd.course.pattern.command.calculator.with;

import design.asd.course.pattern.command.calculator.Calculator;

public class AddCommand implements Command {

    private Calculator calculator;

    private int num;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void execute() {
        System.out.printf("%d + %d = %d\n", calculator.getNum(), num, calculator.add(num));
    }
}
