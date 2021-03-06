package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long sub(Long number1, Long number2) {
        logger.info( "Substraction {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long mult(Long number1, Long number2) {
        logger.info( "Multiplication {} * {}", number1, number2 );
        return number1 * number2;
    }

    public Float div(Long number1, Long number2) {
        logger.info( "Division {} / {}", number1, number2 );
        Float division=0f;
        try {
            division=Float.valueOf(number1/number2);
        }catch (ArithmeticException e){
            logger.info("La division por cero no esta definidad: el segundo numero debe ser diferente de cero");
            division=0f;
        }

        return division;
    }

}
