package design.asd.course.pattern.state.ceilingfan.frequentflyeraccount.withstate;

/**
 * The state pattern can be applied whenever we have complex state logic.
 * The state pattern transforms complex if-then-else logic into many simpler if-then-else structures
 *
 * State advantages:
 * 1. Simpler if-then-else logic
 * 2. Easier to add new state
 * 3. Easier to change state logic
 */
public class Application {
    public static void main(String[] args) {
        FFAccount ffAccount = new FFAccount("213425");
        AccountState accountState = new Silver(ffAccount);
        ffAccount.setAccountState(accountState);
        ffAccount.addFlight(13000);
        System.out.println(ffAccount);

        ffAccount.addFlight(99000);
        System.out.println(ffAccount);
    }
}
