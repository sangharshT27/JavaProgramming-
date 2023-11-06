
package thread;




public class Thread_01 extends Thread {
    @Override
    public void run()
    {
        
        for(int i=0;i<10;i++)
        {
            if(this.getName().equals("Second"))
            {
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    
                }
            }
            System.out.println(this.getName()+i);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        Thread_01 th=new Thread_01();
        Thread_01 th1=new Thread_01();//newlyBorn Stage
        th.setName("First");
        th1.setName("Second");
         th.start();
        th1.start();//Ready to run stage
        
        
        th1.setPriority(10);
        th1.getPriority();
        th.getPriority();
        try{
            th.join();
            th1.join();
        }catch(Exception e)
        {}
            System.out.println("Main Thread Existed");
        
       
 
    }
}
