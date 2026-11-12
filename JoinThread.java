package challenge1;


class JoinThread extends Thread {

    Thread t;

    JoinThread(Thread t) {
        this.t = t;
    }

    public void run() {

        try {
            System.out.println("JoinThread is waiting");
            t.join();
            System.out.println("JoinThread finished waiting");
        } 
        catch (InterruptedException e) {
            System.out.println("JoinThread interrupted");
        }
    }
}