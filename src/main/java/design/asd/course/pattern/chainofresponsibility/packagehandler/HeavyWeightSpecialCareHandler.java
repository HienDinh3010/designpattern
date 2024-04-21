package design.asd.course.pattern.chainofresponsibility.packagehandler;

public class HeavyWeightSpecialCareHandler extends Handler {
    public HeavyWeightSpecialCareHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    void handle(Package thePackage) {
        if (thePackage.isSpecialCare() && thePackage.getWeight() > 100) {
            System.out.println("Handle heavy weight special care package");
        } else {
            nextHandler.handle(thePackage);
        }
    }
}
