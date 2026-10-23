class TicketCounter {
    int tickets=10;

    synchronized void booktkts(String name, int n) {
        if (tickets>=n){
            tickets =tickets - n;
            System.out.println(name + " booked " + n + " tickets.");
        }else{
            System.out.println(name + " Not enough tickets available.");
        }
        System.out.println("Remaining available tickets: " + tickets);
    }
}

class customer extends Thread{
    TicketCounter tc;
    String name;

    customer(TicketCounter tc, String name) {
        this.tc =tc;
        this.name= name;
    }
    public void run(){
        tc.booktkts(name, 4);
    }
}

public class ticketcnter{
    public static void main(String[] args){
        TicketCounter tc= new TicketCounter();
        customer c1 = new customer(tc, "Customer 1");
        customer c2 = new customer(tc, "Customer 2");
        customer c3 = new customer(tc, "Customer 3");
        c1.start();
        c2.start();
        c3.start();
    }
}
