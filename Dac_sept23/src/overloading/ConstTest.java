
package overloading;
public class ConstTest 
{
    int a,b,c;
    ConstTest()
    {
        b=10;
        a=5;
        c=a+b;
        
        
        System.out.println("Addition is   is:"+c);
    }
   ConstTest(int x,int y)
   {
       
       a=x;
       b=y;
       c=a+b;
       
      System.out.println("addition is :"+c);
   }
    
    public static void main(String[] args) 
    {
        
        ConstTest t1=new ConstTest();
        ConstTest t2=new ConstTest(100,150);
         
        

   
    }
}


