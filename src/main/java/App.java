import interaction.ConsoleInteraction;
import parsing.Parser;
import validation.Validator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Map<String, String> expressionData = new HashMap<>();
        ConsoleInteraction.formUserInput(userInput, expressionData);
        System.out.println(expressionData);
        userInput.close();
        Parser.parseExpression(expressionData);
    }
}
