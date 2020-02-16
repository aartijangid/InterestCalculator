package ee.customer.interest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InterestRateCalculatorTest {

    private InterestRateCalculator interestRateCalculator = new InterestRateCalculator();

    @Test
    public void givenAmount500_ShouldReturn_InterestRate1(){
        double amount = 500.00;
        assertEquals(1.00, interestRateCalculator.getInterestRate(amount));
    }

    @Test
    public void givenAmount1000_ShouldReturn_InterestRate1(){
        double amount = 1000.00;
        assertEquals(1.00, interestRateCalculator.getInterestRate(amount));
    }

    @Test
    public void givenAmount1500_ShouldReturn_InterestRate2(){
        double amount = 1500.00;
        assertEquals(2.00, interestRateCalculator.getInterestRate(amount));
    }

    @Test
    public void givenAmount5001_ShouldReturn_InterestRate2(){
        double amount = 5001.00;
        assertEquals(3.00, interestRateCalculator.getInterestRate(amount));
    }

}