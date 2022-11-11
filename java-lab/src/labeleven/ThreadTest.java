package labeleven;

public class ThreadTest extends Thread {
    static {
        Thread t = Thread.currentThread();
        System.out.println("thread test is loaded by " + t.getName() + " thread");
        t.setName("Sarvag ");
        System.out.println("changed name of thread");
        System.out.println("suspending thread for 5 sec");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String arr[]) {
        Thread t = Thread.currentThread();
        System.out.println("main() is invoked in the " + t.getName() + "thread...");
    }
}
