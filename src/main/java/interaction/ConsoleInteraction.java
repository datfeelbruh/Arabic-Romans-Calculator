package interaction;
import converter.ConvertToArabic;
import validation.Validator;

import java.util.Map;
import java.util.Scanner;

public class ConsoleInteraction {
    private static final String NUMBER_DESCRIPTION = "Enter arabic or roman number: ";
    private static final String OPERATOR_DESCRIPTION = "Enter arithmetic operator - '+', '-', '*' or '/' : ";
    private static final String RESULT_TYPE_DESCRIPTION = "Choose type: "
                                                        + "\n" + "1. Roman"
                                                        + "\n" + "2. Arabic"
                                                        + "\n" + ": ";
    private static final String ROMAN_TYPE = "1";
    private static final String ARABIC_TYPE = "2";


    public static void formUserInput(Scanner scanner, Map<String, String> data) {
        System.out.print(NUMBER_DESCRIPTION);
        String firstNumber = scanner.next().toUpperCase();
        if (Validator.isCorrectInputNumber(firstNumber)) {
            throw new IllegalArgumentException("\nInput correct roman or arabic number.");
        }
        data.put("First number", firstNumber);
        System.out.print(OPERATOR_DESCRIPTION);
        String operator = scanner.next();
        if (!Validator.isCorrectOperator(operator)) {
            throw new IllegalArgumentException("\nInput correct arithmetic operator.");
        }
        data.put("Operator", operator);
        System.out.print(NUMBER_DESCRIPTION);
        String secondNumber = scanner.next().toUpperCase();
        if (Validator.isCorrectInputNumber(secondNumber)) {
            throw new IllegalArgumentException("\nInput correct roman or arabic number.");
        }
        data.put("Second number", secondNumber);
        System.out.print(RESULT_TYPE_DESCRIPTION);
        String resultType = scanner.next();
        switch (resultType) {
            case ROMAN_TYPE -> data.put("Result type", "roman");
            case ARABIC_TYPE -> data.put("Result type", "arabic");
            default -> throw new IllegalArgumentException("\nIncorrect choice. Choose correct menu item.");
        }
        data.put("Result type", resultType);
    }
}
