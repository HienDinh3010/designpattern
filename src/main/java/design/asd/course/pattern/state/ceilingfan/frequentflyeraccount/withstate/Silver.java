package design.asd.course.pattern.state.ceilingfan.frequentflyeraccount.withstate;

public class Silver extends AccountState {
    public Silver(FFAccount account) {
        super(account);
    }

    @Override
    void addFlight(int newMiles) {
        account.setNumberOfMiles(account.getNumberOfMiles() + newMiles);
        account.setNumberOfFlights(account.getNumberOfFlights() + 1);
        checkForUpgrade();
    }

    @Override
    String getAccountType() {
        return "Silver";
    }

    @Override
    void checkForUpgrade() {
        if ((account.getNumberOfMiles() > 100_000) ||
                (account.getNumberOfFlights() > 95)) {
            AccountState newState = new Gold(account);
            account.setAccountState(newState);
            account.setNumberOfMiles(account.getNumberOfMiles() + 5_000);
        }
    }
}
