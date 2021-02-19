package co.com.sofka.app.calculator;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Basic calculator")
class BasicCalculatorTest {

     BasicCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new BasicCalculator();
    }

    @AfterEach
    void tearDown() {

    }

    @DisplayName( "sum: ")
    @Test
    void sum() {
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        Long result = calculator.sum(number1, number2);

        assertEquals(expectedValue, result);
    }


    @DisplayName("Several sums: ")
    @ParameterizedTest(name = "{0}+{1}={2}")
    @CsvSource({
            "0,  1,  1",
            "-1, 1,  0",
            "-1 ,-1, -2",
            "7 ,  1,  8",
            })
    void severalSums(Long number1, Long number2, Long expected){
        assertEquals(expected, calculator.sum(number1, number2));
    }

    @DisplayName("Several subs: ")
    @ParameterizedTest(name = "{0}-{1}={2}")
    @CsvSource({
            "0,  1,  -1",
            "-1, 1,  -2",
            "-1 ,-1, 0",
            "7 ,  1,  6",
    })
    void severalSubs(Long number1, Long number2, Long expected){
        assertEquals(expected, calculator.sub(number1, number2));
    }

    @DisplayName("Severals mult: ")
    @ParameterizedTest(name = "{0} * {1}={2}")
    @CsvSource({
            "3,  1,   3",
            "7,  7,  49",
            "2,  -2,  -4",
            "10,  7,  70",
    })
    void severalMult(Long number1, Long number2, Long expected){
        assertEquals(expected, calculator.mult(number1, number2));
    }

   @DisplayName(("Severals div: "))
   @ParameterizedTest(name = "{0} / {1} = {2}")
   @CsvSource({
           "10,   2,   5",
           "0,    0,   0",
           "1,   2,   0",
   })
    void severalDivs(Long number1, Long number2, Float expected){
        assertEquals(expected, calculator.div(number1, number2));

   }
}