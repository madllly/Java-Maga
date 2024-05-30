package lr6;

public class Example3 {
    private static final Object lock = new Object();
    private static int number = 0;

    public static void main(String[] args) {
        Thread evenThread = createThread(true);
        Thread oddThread = createThread(false);
        evenThread.setName("EvenThread");
        oddThread.setName("OddThread");
        evenThread.start();
        oddThread.start();
    }

    static Thread createThread(Boolean honest) {
        return new Thread(() -> {
            synchronized (lock) {
                while (number < 10) {
                    Boolean condition = ((honest) ? number % 2 != 0 : number % 2 == 0);
                    if (condition) {
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            }
        });
    }
}
