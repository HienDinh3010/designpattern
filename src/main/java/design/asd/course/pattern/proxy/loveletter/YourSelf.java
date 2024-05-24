package design.asd.course.pattern.proxy.loveletter;

public class YourSelf {
    public void sendLetter() {
        LetterSenderProxy letterSenderProxy = new LetterSenderProxy(new RealCrush());
        letterSenderProxy.sendLetter();
    }
}
