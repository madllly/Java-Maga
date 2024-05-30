package lr3;

public class Example1 {
    public static void m(int x) {
        System.out.println("x=" + x);
        int xDelta = 2 * x + 1;
        if (xDelta < 20) {
            m(xDelta);
        }
    }

    public static void main(String[] args) {
        m(1);
    }
}
