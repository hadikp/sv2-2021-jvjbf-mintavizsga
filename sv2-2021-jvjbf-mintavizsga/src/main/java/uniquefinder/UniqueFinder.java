package uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {

    public List<Character> getUniqueChars(String input) {
        List<Character> result = new ArrayList<>();
        if (input == null) {
            throw new IllegalArgumentException("Text is null.");
        }
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!result.contains(c)) {
                result.add(c);
            }
        }
        return result;
    }
}
