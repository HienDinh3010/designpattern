package design.asd.course.pattern.state.ceilingfan.frequentflyeraccount.withoutstate;

/**
 * Problem:
 * 1. Add a new state: You need to change the FFAccount class
 * 2. Complex if-then-else logic
 * 3. Logic of state is not reusable for other classes
 */
public class FFAccount {
    private String accountNumber;

    private String accountType;

    private int numberOfMiles;

    private int numberOfFlights;

    public FFAccount(String accountNumber, String accountType) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public void addFlight(int newMiles) {
        if (accountType.equals("silver")) {
            numberOfMiles += newMiles;
            numberOfFlights++;
            checkForUpgrade();
        } else {
            if (accountType.equals("gold")) {
                numberOfMiles += (2 * newMiles);
                numberOfFlights++;
                checkForUpgrade();
            } else {
                if (accountType.equals("platinum")) {
                    numberOfMiles += (3 * newMiles);
                    numberOfFlights++;
                }
            }
        }
    }

    private void checkForUpgrade() {
        if (accountType.equals("silver") && (numberOfMiles > 100_000) || (numberOfFlights > 95)) {
            accountType = "gold";
            numberOfMiles += 5000;
        }
        if (accountType.equals("gold") && (numberOfMiles > 150_000) || (numberOfFlights > 145)) {
            accountType = "platinum";
            numberOfMiles += 10_000;
        }
    }

    @Override
    public String toString() {
        return "FFAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountType='" + accountType + '\'' +
                ", numberOfMiles=" + numberOfMiles +
                ", numberOfFlights=" + numberOfFlights +
                '}';
    }
}
