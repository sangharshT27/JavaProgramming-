
package collection.set;

import java.util.*;


public class BackupDemo {
    public static void main(String[] args) {
        List<Integer>orglst=new ArrayList<>();
        orglst.add(100);
        orglst.add(200);
        orglst.add(300);
        
       List<Integer>backuplst=orglst.subList(0, 2);
       
        System.err.println(orglst);
        System.err.println(backuplst);
        
        backuplst.add(500);
        System.err.println(orglst);
        System.err.println(backuplst);
        
        
      //  backuplst.remove(2);
       // System.err.println(backuplst);
       
       orglst.add(500);
    
    }
}
