
package except_ex;


public class EeceptionDemo_1 
{
        
    
    int a=10;
    int b=0;
    
   void show()
    {
        System.out.println();
        try{
        System.out.println(a/b);
        System.out.println();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        
        }
        
    }
       public static void main(String[] args)
  {
         EeceptionDemo_1 e=new EeceptionDemo_1();
         e.show();
}
}
