import java.util.*;
class queue{
    public static void main(String[] args){
        Queue<String> q= new LinkedList<>();
        q.offer("Name");
        q.offer("John");
        q.offer("Sarah");
        q.offer("Jane");
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}