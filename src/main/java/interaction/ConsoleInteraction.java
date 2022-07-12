package interaction;

import java.util.Scanner;

public class ConsoleInteraction {
    private static final String NUMBER_DESCRIPTION = "Enter arabic or roman number: ";
    private static final String OPERATOR_DESCRIPTION = "Enter arithmetic operator - '+', '-', '*' or '/' : ";
    public static String formUserInput(Scanner scanner) {
        System.out.print(NUMBER_DESCRIPTION);
        String firstNumber = scanner.next();
        System.out.print(OPERATOR_DESCRIPTION);
        String operator = scanner.next();
        System.out.print(NUMBER_DESCRIPTION);
        String secondNumber = scanner.next();
        return firstNumber + operator + secondNumber;
    }
}
