package lr3;

import java.util.HashMap;

public class Example9 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(4, "Four");
        hashMap.put(5, "Five");
        hashMap.put(6, "Six");
        hashMap.put(7, "Seven");
        hashMap.put(8, "Eight");
        hashMap.put(9, "Nine");
        hashMap.put(10, "Ten");

        StringBuilder keysMultiplication = new StringBuilder();
        String zeroKeysStrings = "";

        for (HashMap.Entry<Integer, String> entry : hashMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            if (key > 5) {
                System.out.println("Key > 5: " + value);
            }

            if (key == 0) {
                zeroKeysStrings += value + ", ";
            }

            if (value.length() > 5) {
                if (keysMultiplication.length() == 0) {
                    keysMultiplication.append(key);
                } else {
                    keysMultiplication.append(" * ").append(key);
                }
            }
        }

        if (!zeroKeysStrings.isEmpty()) {
            System.out.println("Strings with key = 0: " + zeroKeysStrings.substring(0, zeroKeysStrings.length() - 2));
        }

        if (keysMultiplication.length() > 0) {
            String[] keysArray = keysMultiplication.toString().split(" \\* ");
            int result = 1;
            for (String key : keysArray) {
                result *= Integer.parseInt(key);
            }
            System.out.println("Multiplication of keys where string length > 5: " + result);
        }
    }
}
