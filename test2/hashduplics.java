import java.util.*;

class hashduplics{
    public static void main(String[] args){
        int[] a={10, 20, 10, 30, 20, 40, 50, 30};
        HashSet<Integer> set =new HashSet<>();
        for (int i=0; i<a.length; i++){
            set.add(a[i]);
        }
        System.out.println("Unique values are: " + set);
        System.out.println("Number of unique elts are: " + set.size());

        if(set.contains(40)){
            System.out.println("40 is present");
        }else{
            System.out.println("40 is not present");
        }
    }
}