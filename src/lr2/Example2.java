package lr2;

public class Example2 {
    public static void main(String[] args) {
        int n = 4;
        int[][] array = new int[n][n];

        fillArrayInSnakeOrder(array);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void fillArrayInSnakeOrder(int[][] array) {
        int value = 1;
        int n = array.length;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = value++;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    array[i][j] = value++;
                }
            }
        }
    }
}