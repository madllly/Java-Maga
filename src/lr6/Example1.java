package lr6;

import java.time.LocalTime;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = createThread();
        Thread t2 = createThread();

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }


    static Thread createThread() {
        return new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
