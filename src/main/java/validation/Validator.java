package validation;

import converter.ConvertToArabic;

import java.util.Arrays;

public class Validator {
    private static final String[] OPERATORS = {"+", "-", "*", "/"};

    public static boolean isCorrectInputNumber(String number) throws IllegalArgumentException {
        return !isArabic(number) && !isRoman(number);
    }
    public static boolean isCorrectOperator(String operator) {
        return Arrays.asList(OPERATORS).contains(operator);
    }

    private static boolean isArabic(String number){
        try {
            Integer.parseInt(number);
        } catch (IllegalArgumentException e) {
            return false;
        }
        return true;
    }

    private static boolean isRoman(String number) {
        try {
            ConvertToArabic.getArabic(number);
        } catch (IllegalArgumentException e) {
            return false;
        }
        return true;
    }
}
