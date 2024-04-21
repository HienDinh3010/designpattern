package design.asd.course.pattern.state.ceilingfan.frequentflyeraccount.withstate;

public abstract class AccountState {

    protected final FFAccount account;

    public AccountState(FFAccount account) {
        this.account = account;
    }

    abstract void addFlight(int newMiles);
    abstract  String getAccountType();
    abstract void checkForUpgrade();
}
