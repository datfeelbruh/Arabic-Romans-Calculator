package converter;

import romans.RomansNumbers;

public class ConvertToRoman {
    private static final RomansNumbers[] ROMANS_VALUES = RomansNumbers.values();
    private static final int VALUES_SIZE = ROMANS_VALUES.length - 1;
    public static String getRoman(int number) {
        int convertingNumber = number;
        StringBuilder romanNumber = new StringBuilder();
        for (int i = VALUES_SIZE; i >= 0; i--) {
            int romanRepresentation = ROMANS_VALUES[i].getWeight();
            while (convertingNumber >= romanRepresentation) {
                romanNumber.append(ROMANS_VALUES[i]);
                convertingNumber -= romanRepresentation;
            }
        }
        return romanNumber.toString();
    }
}
