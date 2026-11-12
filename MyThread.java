package challenge1;

class MyThread extends Thread {

    public void run() {

        try {
            System.out.println(getName() + " is Running");

            System.out.println(getName() + " is yielding");
            Thread.yield();

            System.out.println(getName() + " is sleeping");
            Thread.sleep(5000);

            System.out.println(getName() + " completed");

        } 
        catch (InterruptedException e) {
            System.out.println(getName() + " was Interrupted");
        }
    }
}