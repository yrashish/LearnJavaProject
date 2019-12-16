package learn.array;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String inputString = "gemfire";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            if (map.containsKey(inputString.charAt(i))) {
                map.put(inputString.charAt(i), map.get(inputString.charAt(i)) + 1);
            } else {
                map.put(inputString.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> map1 : map.entrySet()) {
            if (map1.getValue() == 1) {
                System.out.println(map1.getKey());
                break;
            }
        }
    }
}
