
package collection.set;


import java.util.*;


public class DemoHashSet {
    public static void main(String[] args) {
       //Set<Integer> st=new LinkedHashSet<>();
        //Set<Integer> st=new HashSet<>();
          Set<Integer> st=new TreeSet<>();
        
        st.add(10);
         st.add(30);
          st.add(40);
           st.add(500);
            st.add(10);
            
           // System.out.println(st);
           
           for(Integer i:st)
           {
               System.out.println(i);
           }
          
          
         
        
    }
}
