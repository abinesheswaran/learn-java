package MultiThreading;

public class Task extends Thread {
    private int id;
    public Task(int id){
        this.id = id;
    }
    public void run() {
        System.out.println("Task "+id+" starging...");
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println("Task "+id+" done!...\n");
    }
}
