package MultiThreading;

public class MyRunnable implements Runnable{
    private int id;

    public MyRunnable(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Runnable "+id+" starging...");
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println("Runnable "+id+" done!...");
    }
}
