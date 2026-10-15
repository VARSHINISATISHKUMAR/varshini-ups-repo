class ThreadNoSynch {
    public static void main(String[] args)
            throws InterruptedException {

        Thread t1 = new Thread(() -> {
            try {
                System.out.println("Thread 1 started");
                Thread.sleep(2000);
                System.out.println("Thread 1 finished");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 started");
            System.out.println("Thread 2 finished");
        });

        t1.start();
        t1.join();

        t2.start();
    }
}