package design.asd.course.pattern.chainofresponsibility.packagehandler;

public abstract class Handler {

    protected Handler nextHandler;

    public Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    abstract void handle(Package thePackage);

    public Handler getNextHandler() {
        return nextHandler;
    }
}
