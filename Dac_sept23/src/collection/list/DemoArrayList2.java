
package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

 class Demo {
    
    private String empName;
    private String empAdd;
    private int age;
    
   public Demo(String empName,String empAdd,int age)
    
    {
        this.empName=empName;
        this.empAdd=empAdd;
        this.age=age;
        
    }
    
    @Override
    public String toString()
    {
        return empName+","+empAdd+","+age;
    }
    
    
}
public class DemoArrayList2
{
    public static void main(String[] args) {
        ArrayList<Demo>al=new ArrayList<Demo>();
        
        Demo d=new Demo("sangharsh","nagpur",24);
         Demo d1=new Demo("kalyani","nagpur",24);
          Demo d2=new Demo("san","wardha",24);
       
          al.add(d);
          al.add(d1);
          al.add(d2);
          System.out.println(al);
        Iterator<Demo>i=al.iterator();
       for(Demo s:al)
        {
            System.err.println(al);
        }
                  
    }
        
}