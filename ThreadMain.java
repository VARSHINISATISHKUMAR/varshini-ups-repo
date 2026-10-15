class A extends Thread{
    public void run(){
        System.out.println("Task A");
    }
}

class B extends Thread{
    public void run(){
        System.out.println("Task B");
    }
}

public class ThreadMain{
    public static void main(String[] args) throws InterruptedException{
        A t1=new A();
        B t2=new B();
        t1.start();
        Thread.sleep(10000);  
        t2.start();
    }
}



