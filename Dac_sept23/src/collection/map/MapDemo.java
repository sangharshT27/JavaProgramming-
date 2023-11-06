
package collection.map;


import java.util.*;


public class MapDemo {
    public static void main(String[] args) {
        //Map<Integer,String>mp=new HashMap<>();
        //Map<Integer,String>mp=new TreeMap<>();
        Map<Integer,String>mp=new LinkedHashMap<>();
        mp.put(103, "Ramesh");
        mp.put(104, "Suresh");
        mp.put(105, "Mahesh");
        mp.put(101, "Dinesh");
        mp.put(102, "Bhavesh");
       // System.out.println(mp);
       
        for(Integer i:mp.keySet())
        {
            String val=mp.get(i);
            System.err.println("Key :"+i+", value "+val+"ji");
        }
        
        for(String i:mp.values())
        {
            System.err.println(i);
        }
        
    }
}
