
//1.Write a Java program that creates two threads to find and print even and odd numbers from 1
//to 20. ...
package thread.LabTask;




    
class EvenThread extends Thread
{
    @Override
    public void run()
    {
        for(int i=2;i<=20;i+=2)
        {
            System.out.println(this.getName()+i);
        }
           
    }
} 

class OddThread extends Thread{
    
    @Override
    public void run()
    {
        for(int i=1;i<=20;i+=2)
        {
            System.out.println(this.getName()+i);
        }
    }
}
    
  public class LabTask_01 
      
{
    public static void main(String[] args) {
        
        EvenThread lt=new EvenThread();
        OddThread lt1=new OddThread();
       
        lt.setName("Even No");
        lt1.setName("Odd No");
        
        
        lt.start();
        lt1.start();
    }
}


