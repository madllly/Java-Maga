package lr4.Task1;

public class Example10 {
    public static int m() {
        try {
            System.out.println("0");
        } finally {
            System.out.println("1");
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(m());
    }

}
