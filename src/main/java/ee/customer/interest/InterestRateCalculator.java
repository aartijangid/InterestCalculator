package ee.customer.interest;

import ee.customer.exception.InterestException;

public class InterestRateCalculator {

    double interestRate;

    public double getInterestRate(double amount) {
            if (amount <= 1000)
                interestRate = 1.00;
            else if (amount > 1000 && amount <= 5000)
                interestRate = 2.00;
            else if (amount > 5000)
                interestRate = 3.00;

        return interestRate;
    }
}
