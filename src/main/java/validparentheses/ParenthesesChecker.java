package validparentheses;

public class ParenthesesChecker {

    public boolean validParentheses(String parens) {
        int counter = 0;
        for (int i = 0; i < parens.length(); i++) {
            if (parens.charAt(i) == '(') {
                counter++;
            }
            if (parens.charAt(i) == ')') {
                counter--;
            }
            if (counter < 0) {
                return false;
            }
        }
        return counter == 0;
    }
}

