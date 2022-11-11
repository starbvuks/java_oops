package labeleven;

public class ThreadSleep {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        System.out.println("current thread is: " + t);
        t.setName("Sarvag thread");
        System.out.println("after name change thread: " + t);
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }
    }
}
