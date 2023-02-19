package validbraces;

import java.util.HashMap;
import java.util.Map;

public class BraceChecker {

    public boolean isValid(String braces) {
        for (int i = 0; i < braces.length(); i++) {
            String brace = String.valueOf(braces.charAt(i));
            if (bracesMap().containsKey(brace)) {
                Integer integer = bracesMap().get(brace);
                bracesMap().put(brace, ++integer);
            }
        }
        return isOrderOfParenthesesIsValid(bracesMap()) && isOrderOfBracketsIsValid(bracesMap()) && isOrderOfCurlyBracesIsValid(bracesMap());
    }

    private Map<String, Integer> bracesMap() {
        Map<String, Integer> bracesMap = new HashMap<>();
        bracesMap.put("(", 0);
        bracesMap.put(")", 0);
        bracesMap.put("{", 0);
        bracesMap.put("}", 0);
        bracesMap.put("[", 0);
        bracesMap.put("]", 0);
        return bracesMap;
    }

    private boolean isOrderOfParenthesesIsValid(Map<String, Integer> bracesMap) {
        return bracesMap.get(")").intValue() == bracesMap.get("(").intValue();
    }

    private boolean isOrderOfBracketsIsValid(Map<String, Integer> bracesMap) {
        return bracesMap.get("]").intValue() == bracesMap.get("[").intValue();
    }

    private boolean isOrderOfCurlyBracesIsValid(Map<String, Integer> bracesMap) {
        return bracesMap.get("}").intValue() == bracesMap.get("{").intValue();
    }

}
