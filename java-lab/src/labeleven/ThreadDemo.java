package labeleven;

class NewThread implements Runnable {
    Thread t;

    NewThread() {
        /*
         * 'this' refers to current class object
         * first param is object of class implementing interface
         */
        t = new Thread(this, "Test Thread");
        // prints name, priority, group
        System.out.println("Child Thread: " + t);
        t.start(); // will start a child thread, currently in ready state
    }

    public void run() { // running state
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500); // sleep = waiting state
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted");
        }
        System.out.println("Exit Child Thread");
    }
}

public class ThreadDemo {
    public static void main(String args[]) {
        NewThread t = new NewThread();
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main Thread: "+i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {            
            System.out.println("Main Thread Interrupted");
            
        }
        System.out.println("Exit Main Thread");
    }
}
// close = temrinate state
