import java.util.*;
class collmap{
    public static void main(String[] args){
        HashMap<Integer, String> mapp = new HashMap<>();
        mapp.put(73, "Varshini");
        mapp.put(34, "John");
        mapp.put(3, "Varshini");
        System.out.println(mapp);
        System.out.println(mapp.get(73));
        System.out.println(mapp.containsKey(73));

    }
}
