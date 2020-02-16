package ee.customer.interest;

import ee.customer.exception.InterestException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class InterestCalculatorTest {

    private InterestCalculator interestCalculator;

    @Mock
    private InterestRateCalculator interestRateCalculator;

    @BeforeEach
    public void setUp() {
        interestCalculator = new InterestCalculator(interestRateCalculator);
    }

    @Test
    public void givenAmount500_ShouldReturn_Interest5() {
        double amount = 500.00;

        when(interestRateCalculator.getInterestRate(amount)).thenReturn(1.00);

        assertEquals(5, interestCalculator.calculateInterest(amount));
    }

    @Test
    public void givenNegativeAmount_ShouldThrowInterestException() {
        double amount = -500.00;

        assertThrows(InterestException.class, () -> interestCalculator.calculateInterest(amount));
    }
}