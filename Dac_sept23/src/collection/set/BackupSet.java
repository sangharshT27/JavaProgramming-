
package collection.set;

import java.util.*;


public class BackupSet {
    public static void main(String[] args) {
        Set<Integer> originalset=new HashSet<>();
        
        originalset.add(100);
        originalset.add(200);
        originalset.add(300);
        
       // Set<Integer> backupset=Collections.unmodifiableSet(new HashSet<>(originalset));
       Set<Integer> backupset=new HashSet<>(originalset);
        
     
        System.err.println(originalset);
        System.err.println(backupset);
        
       try{
           backupset.add(400);
       }
       catch(Exception e)
       {
           System.err.println(originalset);
           System.err.println(backupset);
       }
    }
}
