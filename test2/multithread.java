class Buffer{
    int num;
    boolean available= false;

    synchronized void produce(int n) throws InterruptedException{
        while(available){
            wait();
        }
        num= n;
        available= true;
        System.out.println("Produced: " + n);
        notify();
    }

    synchronized void consume() throws InterruptedException{
        while (!available){
            wait();
        }
        System.out.println("Consumed: " + num);
        available= false;
        notify();
    }
}

public class multithread{
    public static void main(String[] args) {
        Buffer b= new Buffer();
        Thread p= new Thread(() ->{
            try{
                for(int i=1; i<=5; i++)
                    b.produce(i);
            }catch(InterruptedException e){}
        });

        Thread c= new Thread(() -> {
            try{
                for(int i = 1; i <= 5; i++)
                    b.consume();
            }catch (InterruptedException e) {}
        });
        p.start();
        c.start();
    }
}