package design.asd.course.pattern.chainofresponsibility.packagehandler;

public class InternaltionalNormalCareHandler extends Handler {
    public InternaltionalNormalCareHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    void handle(Package thePackage) {
        if (thePackage.isInternational() && !thePackage.isSpecialCare()) {
            System.out.println("Handle international normal package");
        } else {
            nextHandler.handle(thePackage);
        }
    }
}
