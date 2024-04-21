package design.asd.course.pattern.chainofresponsibility.packagehandler;

public class ExpensivePackageHandler extends Handler {

    public ExpensivePackageHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    void handle(Package thePackage) {

    }
}
