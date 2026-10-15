class ThreadSynch{
    public static void main(String[] args){
        Object obj =new Object();
        Thread t1 =new Thread(() -> {
            synchronized(obj){
                for (int i=1; i<=2; i++) {
                    System.out.println("Thread 1 is running for the " + i + "th time");
                    
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized(obj){
                for (int i=1; i<=2; i++) {
                    System.out.println("Thread 2 is running for the " + i + "th time");
                    
                }
            }
        });

        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Exception...");
        }
        t1.start();
        t2.start();
    }
}