package MultiThreading;

public class Thread_test {
    public static void main(String args[]) {
        System.out.println("Start singleThread....");
        singleThread();
        System.out.println("End....\n");

        System.out.println("Start MultiThread.....");
        multiThread();
        System.out.println("End....\n");

        System.out.println("Start Multi Runnable Thread.....");
        runnable();
        System.out.println("End....\n");
    }

    public static void singleThread() {
        System.out.println("Task 1 starging...");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println("Task 1 done!...\n");

        System.out.println("Task 2 starting...");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println("Task 2 done!...\n");
    }

    public static void multiThread() {
        Task t1 = new Task(1);
        Task t2 = new Task(2);
        Task t3 = new Task(3);
        t1.start();
        t2.start();
        t3.start();
    }

    public static void runnable() {
        Thread t1 = new Thread(new MyRunnable(1));
        Thread t2 = new Thread(new MyRunnable(2));
        Thread t3 = new Thread(new MyRunnable(3));
        t1.start();
        t3.start();
        t2.start();
    }
}
