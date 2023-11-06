
package collection.map;

//import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


public class Concurency {
    public static void main(String[] args) {
        
        //HashMap<Integer,String>hmp=new HashMap<>();
     ConcurrentHashMap<Integer,String> hmp=new ConcurrentHashMap<>();
       //ConcurrentHashSet<String> hmp=new ConcurrentHashSet<>();
        
        hmp.put(101, "Ramesh");
          hmp.put(102, "Ram");
            hmp.put(103, "suresh");
        

              
              
              Runnable task=()->{
                  
                  for(int i=104;i<=106;i++)
                  {
                      hmp.put(i,"value"+i);
                  }
              
              };
                    
              Thread t1=new Thread(task);
              Thread t2=new Thread(task);
              Thread t3=new Thread(task);
              
             t1.start();
             t2.start();
             t3.start();
             
             try
             {
                 t1.join();
                 t2.join();
                 t3.join();
                 
             }
             catch(Exception e)
             {
                 System.out.println(e.getMessage());
             }
          
          
           System.out.println(hmp);
        
    }
}
