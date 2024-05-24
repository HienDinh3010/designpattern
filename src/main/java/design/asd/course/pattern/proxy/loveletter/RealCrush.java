package design.asd.course.pattern.proxy.loveletter;

public class RealCrush implements ICrush {
    @Override
    public void sendLetter() {
        System.out.println("Letter is accepted");
    }
}
