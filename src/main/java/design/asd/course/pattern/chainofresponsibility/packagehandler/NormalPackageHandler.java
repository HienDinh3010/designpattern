package design.asd.course.pattern.chainofresponsibility.packagehandler;

public class NormalPackageHandler extends Handler {
    public NormalPackageHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    void handle(Package thePackage) {
        System.out.println("Handle normal package");
    }
}
