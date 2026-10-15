class ThreadWaitNotify {
    public static void main(String[] args) {

        Object obj=new Object();

        Thread t1 =new Thread(() -> {
            synchronized (obj){
                try{
                    System.out.println("Thread 1: Waiting...");
                    obj.wait();
                    System.out.println("Thread 1: Resumed!");
                }catch (InterruptedException e){
                    System.out.println(e);
                }
            }
        });

        Thread t2 =new Thread(() -> {
            synchronized (obj){
                System.out.println("Thread 2: Notifying...");
                obj.notify();
            }
        });

        t1.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t2.start();
    }
}