package CalculatorView;

public class ConsoleVIew {
    private static final String DESCRIPTION = "Calculator for expressions types number1 operator number2."
                                            + "\n" + "Arabic Example: 5 + 3."
                                            + "\n" + "Romans Example: X * IV."
                                            + "\n" + "Valid numbers range from 1 to 62 or from I to LX."
                                            + "\n" + "Valid operators: '+', '-', '/', '*'.";
    public static void run(){
        System.out.println(DESCRIPTION);
    }
}
