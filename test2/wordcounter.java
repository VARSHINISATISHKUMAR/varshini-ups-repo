import java.util.*;
class wordcounter{
    public static void main(String[] args){
        String s= "java is easy and python is powerful";
        HashMap<String, Integer> map= new HashMap<>();
        if(s.isEmpty()){
            System.out.println("The sentence is empty. Can't calculate word frequency.");
            return;
        }
        String[] words= s.toLowerCase().split("\\s+");
        for (String w: words){
            map.put(w, map.getOrDefault(w,0) + 1);
        }
        System.out.println(map);

        String maxw= "";
        int max=0;
        for (String w: map.keySet()){
            if(map.get(w)>max){
                max=map.get(w);
                maxw=w;
            }
        }
        System.out.println();
    }
}
