package parsing;

import converter.ConvertToArabic;
import java.util.Map;

public class Parser {
    private static final String OPERATOR_KEY = "Operator";
    private static final String FIRST_NUMBER_KEY = "First number";
    private static final String SECOND_NUMBER_KEY = "Second number";
    private static final String RESULT_TYPE_KEY = "Result type";

    public static void parseExpression(Map<String, String> data) {
        final int firstNumber = ConvertToArabic.getArabic(data.get(FIRST_NUMBER_KEY));
        final int secondNumber = ConvertToArabic.getArabic(data.get(SECOND_NUMBER_KEY));
        final String operator = data.get(OPERATOR_KEY);
        final String resultType = data.get(RESULT_TYPE_KEY);
        Calc.calculate(firstNumber, secondNumber, operator);
    }
}
