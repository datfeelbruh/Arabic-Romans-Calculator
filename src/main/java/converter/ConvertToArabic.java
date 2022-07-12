package converter;

import romans.RomansNumbers;

public class ConvertToArabic {
    public static int getArabic(String romanNumber) {
        int arabicNumber = 0;
        int romansNumberSize = romanNumber.length() - 1;
        String upperRoman = romanNumber.toUpperCase();
        for (int i = 0; i < romansNumberSize; i++) {
            int currentArabic = getSingleArabic(upperRoman.charAt(i));
            int nextArabic = getSingleArabic(upperRoman.charAt(i + 1));
            if (currentArabic < nextArabic) {
                arabicNumber -= currentArabic;
            } else {
                arabicNumber += currentArabic;
            }
        }
        int lastArabic = getSingleArabic(upperRoman.charAt(romansNumberSize));
        arabicNumber += lastArabic;
        return arabicNumber;
    }

    private static int getSingleArabic(char singleRoman) {
        String stringRoman = Character.toString(singleRoman);
        return RomansNumbers.valueOf(stringRoman).getWeight();
    }
}
