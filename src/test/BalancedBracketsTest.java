package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {

        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void noBracketsStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void bracketsInsideOfString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("String[string]"));
    }
    @Test
    public void bracketsBeforeString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]String"));
    }
    @Test
    public void onlyOneOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[String"));
    }
    @Test
    public void backwardsBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("String]string["));
    }

}
