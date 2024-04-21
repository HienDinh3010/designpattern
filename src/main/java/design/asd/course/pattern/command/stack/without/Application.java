package design.asd.course.pattern.command.stack.without;

import design.asd.course.pattern.command.stack.Stack;

public class Application {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(Integer.valueOf(6));
        stack.push(Integer.valueOf(2));
        stack.push(Integer.valueOf(8));

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
