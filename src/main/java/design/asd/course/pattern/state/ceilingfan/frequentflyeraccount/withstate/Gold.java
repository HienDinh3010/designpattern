package design.asd.course.pattern.state.ceilingfan.frequentflyeraccount.withstate;

public class Gold extends AccountState {
    public Gold(FFAccount account) {
        super(account);
    }

    @Override
    void addFlight(int newMiles) {
        account.setNumberOfMiles(account.getNumberOfMiles() + 2 * newMiles);
        account.setNumberOfFlights(account.getNumberOfFlights() + 1);
        checkForUpgrade();
    }

    @Override
    String getAccountType() {
        return "Gold";
    }

    @Override
    void checkForUpgrade() {
        if (account.getNumberOfMiles() > 150_000 || account.getNumberOfFlights() > 145) {
            AccountState newState = new Platinum(account);
            account.setAccountState(newState);
            account.setNumberOfMiles(account.getNumberOfMiles() + 10_000);
        }
    }
}
