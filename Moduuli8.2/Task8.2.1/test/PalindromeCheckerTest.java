import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeCheckerTest {
    @Test
    public void testIsPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();

        assertTrue(checker.isPalindrome("radar"));
        assertTrue(checker.isPalindrome("Saippuakivikauppias"));
        assertTrue(checker.isPalindrome("innostunut sonni"));
        assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama"));
        assertTrue(checker.isPalindrome("1+1"));
        assertFalse(checker.isPalindrome("hello"));
        assertFalse(checker.isPalindrome("FOOLPROOF"));
        assertFalse(checker.isPalindrome("openai"));
    }
}
