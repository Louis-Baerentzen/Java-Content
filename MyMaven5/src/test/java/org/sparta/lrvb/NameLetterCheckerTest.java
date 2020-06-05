package org.sparta.lrvb;




import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NameLetterCheckerTest {
    @Test
    @DisplayName("return true for 2 identical char. next to each other")
    void returnTrueLowerCase() {
        Assertions.assertEquals(true, NameLetterChecker.checkForDuplicates("Ball"));
    }

    @Test
    @DisplayName("return true for 2 identical char. ignore casing")
    void returnTrueIgnoreCase() {
        Assertions.assertEquals(true, NameLetterChecker.checkForDuplicates("BaLl"));

    }

    //Word 3
    @Test
    @DisplayName("return true  for 2 identical char. ignoring word boundaries")
    void returnTrueIgnoreBoundaries() {
        Assertions.assertEquals(true, NameLetterChecker.checkForDuplicates("bal l"));
    }

    //Word 4
    @Test
    @DisplayName("return true  for 2 identical char. ignoring new line")
    void returnTrueIgnoreSpace() {
        Assertions.assertEquals(true, NameLetterChecker.checkForDuplicates("ball"));
    }

    //Word 5
    //next line and concatenations are ignored
    @Test
    @DisplayName("return true  for 2 identical char. ignoring signs")
    void returnTrueIgnoreAll() {
        Assertions.assertEquals(true, NameLetterChecker.checkForDuplicates("bal-!'?$^&*@()+=_¬`|<>/\"l"));
    }

}
