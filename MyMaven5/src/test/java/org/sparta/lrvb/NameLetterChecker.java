package org.sparta.lrvb;

public class NameLetterChecker {
    static boolean checkForDuplicates(String word) {
        String word2 = word.toLowerCase();
        String word3 = word2.replaceAll("\b", "");
        String word4 = word3.replaceAll("\n", "");
        String testWord = word4.replaceAll("[-, !'?$^&*@#£%™€•ªº¶§∞¢¡⁄‹›ﬁ‡·‚Œ„‰ÁË∏ØÅÎ()+=_¬`|<>/\"]", "");
        String numbers = testWord.replaceAll("[0-9]", "");




        for (int i = 0; i < numbers.length(); i++) {
            char ch = numbers.charAt(i);
            if (numbers.charAt(i) == numbers.charAt(i + 1)) {
                return true;
            }
        }

        return false;
    }

    //if the String has 2 of the same letter next to each other,
    //it will return true
    //otherwise its should return false

    //not null
    //true for 2 letters being same
    //break into char
    //split array
    //regex?


    //  if re.search(r"(.)\1", test)

}
