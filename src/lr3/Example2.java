package lr3;

public class Example2 {
    public static void m(int x) {
        int xDelta = 2 * x + 1;
        if (xDelta < 20) {
            m(xDelta);
        }
        System.out.println("x=" + x);
    }

    public static void main(String[] args) {
        m(1);
    }
}
