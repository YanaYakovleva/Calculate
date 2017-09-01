package calculatorClass;

import calculatorForm.Calculate;
import myExceptions.DivisionByZeroException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void getQuotient()  {
        Double result = null;
        String message="Result is wrong";
        try {
            Calculator calculator = new Calculator();
            calculator.setDivisible(12.0);
            calculator.setDivisor(0.0);
            result = calculator.getQuotient();
        }
        catch (NumberFormatException exception){
            message = "Invalid number format";
        }
         catch (IllegalArgumentException
                | DivisionByZeroException
                | NullPointerException
                exception){
            message = exception.getMessage();
        }
        assertEquals(12.0, (double)result, message);

    }

}