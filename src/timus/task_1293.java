package timus;

import java.util.Scanner;
import java.io.PrintWriter;

public class task_1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();

        out.println((N * A * B) * 2);
        out.flush();
    }
}
