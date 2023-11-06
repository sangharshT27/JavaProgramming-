
package collection.set;

import java.util.*;


public class DemohashSet2 {
    public static void main(String[] args) {
        List<Integer> lst=Arrays.asList(10,20,30,40,40,50,60,70,10);
        
        Set<Integer> st=new HashSet<>();
        st.addAll(lst);
        System.out.println(lst);
        
        System.out.println(st);
        lst=new ArrayList<>();
        System.out.println(lst);
        
        
    }
}
