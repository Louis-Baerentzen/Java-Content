package com.sparta.lrvb;

public class reverseIt {
    public static String reverseString(String yourInput) {
        String yourReversedString = "";

        for (int i = yourInput.length()-1; i >= 0; i--) {
            yourReversedString += yourInput.charAt(i);
        }
        return yourReversedString;
    }

}
