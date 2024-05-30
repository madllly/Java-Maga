package lr3;

import java.util.HashMap;
import java.util.Map;

public class Example5 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "FFFFFF");
        map.put(1, "xvxcvxcv");
        map.put(2, "rtyuilk");
        map.put(3, "qwerty");
        map.put(4, "qwert");
        map.put(5, "qwe");
        map.put(6, "qwecxv444");
        map.put(7, "345345gg");
        map.put(8, "wervv");
        map.put(9, "dasdbmk");
        map.put(10, "ipiokj");

        String result = "";
        int product = 1;

        for (Integer key : map.keySet()) {
            if (key > 5) {
                System.out.println(map.get(key));
            } else if (key == 0) {
                result = String.join(", ", map.values());
            }

            if (map.get(key).length() > 5) {
                product *= key;
            }
        }

        System.out.println("Результат: " + result);
        System.out.println("Произведение ключей с длиной строки больше 5: " + product);
    }
}
