package lr3;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = scanner.nextInt();
        

        String binary = convertDecimalToBinary(decimal);
        System.out.println("Двоичное представление числа " + decimal + " : " + binary);
        scanner.close();
    }

    public static String convertDecimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        } else {
            return convertDecimalToBinary(decimal / 2) + decimal % 2;
        }
    }
}
