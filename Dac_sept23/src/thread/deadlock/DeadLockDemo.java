
package thread.deadlock;

import static java.lang.Thread.sleep;




public class DeadLockDemo {
    public static void main(String[] args)
    {
        
        String rec1="Aman";
        String rec2="Suman";
        
        Thread t1=new Thread()
                
        {
               @Override
               public void run()
               {
                   synchronized(rec1)
                   {
                   System.out.println("Thread 1 uses Resource 1"+rec1);
                   
                  
                   try {
                       sleep(100);
                   } catch (InterruptedException ex) {
                     
                   }
                   
                   synchronized(rec2)
                   {
                       System.out.println("Thread 2 uses Resource 2"+rec2);
                   }
                 }
               }   
                   
               
       
        };
        
         Thread t2=new Thread()
                
        {
               @Override
               public void run()
               {
                   synchronized(rec1){
                   System.out.println("Thread 1 uses Resource 1"+rec1);
                   
                  
                   try {
                       sleep(100);
                   } catch (InterruptedException ex) {
                     
                   }
                   
                   synchronized(rec2)
                   {
                       System.out.println("Thread 2 uses Resource 2"+rec2);
                   }
                 }
               }   
                   
               
       
        };
        
        
        t1.start();
        t2.start();
                
            
        
    }
}
