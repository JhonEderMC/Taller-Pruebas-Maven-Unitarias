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

    public Long div(Long number1, Long number2) {
        logger.info( "Division {} / {}", number1, number2 );
        Long division=0l;
        try {
            division=number1/number2;
        }catch (Number){

        }

        return number1 / number2;
    }

}
