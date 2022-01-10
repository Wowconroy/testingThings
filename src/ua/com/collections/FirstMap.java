package ua.com.collections;

import java.util.*;

public class FirstMap {
    public static void main(String[] args) {
        java.util.Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");
        map.put(6, "F");
        int [] intAr = new int[map.size()];
        for(java.util.Map.Entry<Integer, String> enmap: map.entrySet()){
            System.out.println(enmap.getKey() + " ==> " + enmap.getValue());
        }
        System.out.println("~~~");
        for(Integer s : map.keySet()){
            System.out.println(s + " ");
        }
        System.out.println("~~~");
        for(String s : map.values()){
            System.out.println(s);
        }

 //       Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        Set set = new HashSet();
        set.add(1);
        set.add(1);
        set.add(2);
        System.out.println(set);




    }
}
