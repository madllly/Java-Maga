package lr3;

public class Example3 {
    private static int step = 0;

    public static void m(int x) {
        space();
        System.out.println("" + x + "-> ");
        step++;
        int xDelta = 2 * x + 1;
        if (xDelta < 20) {
            m(xDelta);
        }
        step--;
        space();
        System.out.println("" + x + " <-");
    }

    public static void space() {
        for (int i = 0; i < step; i++) {
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        m(1);
    }
}
