import interaction.ConsoleInteraction;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String expression = ConsoleInteraction.getUserInput(userInput);
        userInput.close();
    }
}
