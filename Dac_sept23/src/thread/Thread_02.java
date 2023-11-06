
package thread;


public class Thread_02 implements Runnable
{
    String name;
    public  Thread_02(String name)
    {
        this.name=name;
    }
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(this.name+i);
        }
    }
    public static void main(String[] args) {
        Thread_02 t1= new Thread_02("First");
        Thread_02 t2=new Thread_02("Second");
        
       
        Thread th=new Thread(t1);
        Thread th1=new Thread(t2);
        th.start();
        th1.start();
        
    }
}
