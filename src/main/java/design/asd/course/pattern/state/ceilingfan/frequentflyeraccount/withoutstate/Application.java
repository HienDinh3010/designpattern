package design.asd.course.pattern.state.ceilingfan.frequentflyeraccount.withoutstate;

public class Application {
    public static void main(String[] args) {
        FFAccount ffAccount = new FFAccount("213425", "silver");
        ffAccount.addFlight(13_000);
        System.out.println(ffAccount);

        ffAccount.addFlight(99_000);
        System.out.println(ffAccount);
    }
}
