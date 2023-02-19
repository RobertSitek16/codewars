package validparentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParenthesesCheckerTest {

    ParenthesesChecker parenthesesChecker = new ParenthesesChecker();

    @Test
    public void sampleTest() {
        assertTrue(parenthesesChecker.validParentheses("adasdasfa"));
        assertTrue(parenthesesChecker.validParentheses("32423(sgsdg)"));
        assertTrue(parenthesesChecker.validParentheses("(())"));

        assertFalse(parenthesesChecker.validParentheses(")("));
        assertFalse(parenthesesChecker.validParentheses("())"));
        assertFalse(parenthesesChecker.validParentheses("(dsgdsg))2432"));
    }

}