package ee.customer.interest;

import ee.customer.exception.InterestException;

public class InterestCalculator {

    private InterestRateCalculator interestRateCalculator;

    InterestCalculator(InterestRateCalculator interestRateCalculator){
        this.interestRateCalculator = interestRateCalculator;
    }

    public double calculateInterest(double amount) throws InterestException {
        if(amount > 0)
            return (amount * interestRateCalculator.getInterestRate(amount)) / 100;
        else
            throw new InterestException("Negative amount exception");
    }
}
