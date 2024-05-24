package design.asd.course.pattern.proxy.loveletter;

public class LetterSenderProxy implements ICrush {

    private ICrush crush;

    public LetterSenderProxy(ICrush crush) {
        this.crush = crush;
    }

    @Override
    public void sendLetter() {
        System.out.println("Checking the letter's outlook");
        crush.sendLetter();
        System.out.println("Letter sent!!!");
    }
}
