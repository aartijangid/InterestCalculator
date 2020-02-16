package ee.customer.interest;

public class InterestCalculator {

    private InterestRateCalculator interestRateCalculator;

    InterestCalculator(InterestRateCalculator interestRateCalculator){
        this.interestRateCalculator = interestRateCalculator;
    }

    public double calculateInterest(double amount) {
        return (amount * interestRateCalculator.getInterestRate(amount)) / 100;
    }
}
