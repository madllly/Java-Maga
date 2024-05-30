package lr6;

import java.util.Arrays;

public class Example6 {
    private static int sum = 0;

    public static int sumParallel(int[] array) {
        int numThreads = Runtime.getRuntime().availableProcessors();
        Thread[] threads = new Thread[numThreads];
        int size = array.length / numThreads;

        for (int i = 0; i < numThreads; i++) {
            final int start = i * size;
            final int end = (i == numThreads - 1) ? array.length : (i + 1) * size;
            threads[i] = new Thread(() -> {
                int localSum = 0;
                for (int j = start; j < end; j++) {
                    localSum += array[j];
                }
                synchronized (Example6.class) {
                    sum += localSum;
                }
            });

            threads[i].start();
        }

        joinAll(threads);
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {34, 34, 12, -1, 34};
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Sum: " + sumParallel(array));
    }

    static void joinAll(Thread[] threads) {
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
