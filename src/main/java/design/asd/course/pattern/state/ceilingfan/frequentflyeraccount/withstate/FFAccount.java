package design.asd.course.pattern.state.ceilingfan.frequentflyeraccount.withstate;

public class FFAccount {
    private String accountNumber;
    private int numberOfMiles;

    private int numberOfFlights;

    private AccountState accountState;

    public int getNumberOfMiles() {
        return numberOfMiles;
    }

    public void setNumberOfMiles(int numberOfMiles) {
        this.numberOfMiles = numberOfMiles;
    }

    public int getNumberOfFlights() {
        return numberOfFlights;
    }

    public void setNumberOfFlights(int numberOfFlights) {
        this.numberOfFlights = numberOfFlights;
    }

    public FFAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void addFlight(int newMiles) {
        accountState.addFlight(newMiles);
    }

    public String getAccountType() {
        return accountState.getAccountType();
    }

    public AccountState getAccountState() {
        return accountState;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    @Override
    public String toString() {
        return "FFAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", numberOfMiles=" + numberOfMiles +
                ", numberOfFlights=" + numberOfFlights +
                ", accountType=" + accountState.getAccountType() +
                '}';
    }
}
