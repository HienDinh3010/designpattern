package design.asd.course.pattern.command.calculator;

public class Calculator {

    private int num;

    public int getNum() {
        return num;
    }

    public Calculator(int num) {
        this.num = num;
    }

    public int add(int n) {
        return num + n;
    }

    public int subtract(int n) {
        return num - n;
    }
}
