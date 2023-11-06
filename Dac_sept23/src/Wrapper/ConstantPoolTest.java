
package Wrapper;


public class ConstantPoolTest 
{
    public static void main(String[] args)
    {
        //For Integer Family -128 to 127
        //Byte b1=Byte.valueOf("50");
        //Byte b2=Byte.valueOf("50");
        
        
        Short b1=Short.valueOf("127");
        Short b2=Short.valueOf("127");
          System.out.println(b1==b2);
          
          
          Integer b3=Integer.valueOf("126");
          Integer b4=Integer.valueOf("126");
          System.out.println(b3==b4);
          
          Double b5=Double.valueOf("123");
          Double b6=Double.valueOf("123");
          System.out.println(b5==b6);
          
          Boolean c1=Boolean.valueOf(true);
          Boolean c2=Boolean.valueOf(true);
          System.out.println(c1==c2);
          
          Float f1=Float.valueOf("12.5");
          Float f2=Float.valueOf("12.5");
          System.out.println(f1==f2);
          
          //Range for Charactor for constant pool \u00000 to \u007f;
          System.out.println('\u0042');
          Character c3=Character.valueOf('A');
          Character c4=Character.valueOf('A');
          System.out.println(c3==c4);
          Character c5=Character.valueOf('\u0950');
          System.out.println(c5);
          
    }
    
    
}
