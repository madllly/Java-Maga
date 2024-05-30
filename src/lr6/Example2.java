package lr6;

import java.time.LocalTime;

public class Example2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = createThread();
        t.start();
        t.join();
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
