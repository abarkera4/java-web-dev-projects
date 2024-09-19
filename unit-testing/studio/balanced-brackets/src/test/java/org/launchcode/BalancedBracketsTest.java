package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void onlyBracketsReturnTrue() {
        String message = "a single set of balanced brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), message);
    }

    @Test
    public void singleBracketsBeforeMessage() {
        String message = "balanced brackets before other characters returns true";
        String testData = "[]Launchcode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void singleBracketsAroundMessage() {
        String message = "balanced brackets around other characters returns true";
        String testData = "[LaunchCode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void singleBracketsWithinMessage() {
        String message = "balanced brackets within other characters returns true";
        String testData = "Launch[Code]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void multipleSingleBracketsReturnsTrue() {
        String message = "consecutive pairs of brackets return true";
        String testData = "[][][][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void multipleNestedBracketsReturnTrue() {
        String message = "multiple pairs of nested brackets returns true";
        String testData = "[[[[[]]]]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void noBracketsReturnsTrue() {
        String message = "no brackets, only other characters retruns true";
        String testData = "LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void emptyString() {
        String message = "empty string returns true";
        String testData = "";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void singleOpenBracketReturnsFalse() {
        String message = "single open bracket returns false";
        String testData = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void singleClosingBracketReturnsFalse() {
        String message = "single closed bracket returns false";
        String testData = "]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void reverseOpenAndCloseBrackets() {
        String message = "revering bracket order returns false";
        String testData = "][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void singleOpenBracketBeforeMessage() {
        String message = "single open bracket before other characters returns false";
        String testData = "[LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void reservedBracketsWithinMessage() {
        String message = "reversed brackets in other characters returns false";
        String testData = "Launch]Code[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void mixedBrackets() {
        String message = "mixed brackets returns false";
        String testData = "[[]][][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

}