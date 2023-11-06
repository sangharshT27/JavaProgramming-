//3.Write a java program to call run method directly from the Main method.

package thread.LabTask;

class MyThread extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
        }
    }
}
public class LabTask_03 {
    public static void main(String[] args) {
        MyThread th=new MyThread();
        th.run();
        
        
        System.out.println("Main thread is complete");
    }
}
