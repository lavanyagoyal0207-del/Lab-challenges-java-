package challenge1;


public class ThreadLifecycleDemo {

    public static void main(String[] args) throws Exception {

        MyThread t1 = new MyThread();

        System.out.println("State after create: " + t1.getState());

        t1.start();

        Thread.sleep(200);

        System.out.println("State after start: " + t1.getState());

        JoinThread t2 = new JoinThread(t1);

        t2.start();

        Thread.sleep(200);

        System.out.println("State of t2: " + t2.getState());

        System.out.println("Interrupting t1");

        t1.interrupt();

        t1.join();
        t2.join();

        System.out.println("State t1: " + t1.getState());
        System.out.println("State t2: " + t2.getState());

        System.out.println("completed");
    }
}