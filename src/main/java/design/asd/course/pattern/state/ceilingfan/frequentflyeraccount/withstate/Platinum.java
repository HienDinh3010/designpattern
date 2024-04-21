package design.asd.course.pattern.state.ceilingfan.frequentflyeraccount.withstate;

public class Platinum extends AccountState {
    public Platinum(FFAccount account) {
        super(account);
    }

    @Override
    void addFlight(int newMiles) {
        account.setNumberOfMiles(account.getNumberOfMiles() + 3 * newMiles);
        account.setNumberOfFlights(account.getNumberOfFlights() + 1);
    }

    @Override
    String getAccountType() {
        return "Platinum";
    }

    @Override
    void checkForUpgrade() {

    }


}
