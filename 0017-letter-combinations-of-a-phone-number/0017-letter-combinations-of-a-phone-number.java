import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        Map<Character, String> phoneMap = new HashMap<>();
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");

        List<String> result = new ArrayList<>();
        backtrack(digits, 0, new StringBuilder(), result, phoneMap);
        return result;
    }

    private void backtrack(String digits, int index, StringBuilder path, List<String> result, Map<Character, String> phoneMap) {
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = phoneMap.get(digit);

        for (char letter : letters.toCharArray()) {
            path.append(letter);
            backtrack(digits, index + 1, path, result, phoneMap);
            path.deleteCharAt(path.length() - 1); // Backtrack step
        }
    }
}
