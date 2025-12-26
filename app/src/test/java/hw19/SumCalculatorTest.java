package hw19;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    private SumCalculator calculator;
    
    @BeforeEach
    private void initCalculator(){
        calculator = new SumCalculator();
    }

    @Test
    public void sum1Test(){
        int actualResult = calculator.sum(1);
        int expectedResult = 1;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void sum3Test(){
        int actualResult = calculator.sum(3);
        int expectedResult = 6;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void sum0Test(){
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }

}
