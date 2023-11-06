
package overloading;


public class Cdac 
{
    int a,b,c;
    Cdac()
    {
        a=100;
        System.out.println("value of a:"+a);
    }
    Cdac(int x)
    {
        a=x;
        System.out.println("value of A is :"+a);
        
      
    }
    Cdac(int x,int y)
    {
      a=x;
      b=y;
      
      c=a+b;
        System.out.println("Additon is:"+c);
    }
    
    
    public static void main(String[] args)
    {
        Cdac c=new Cdac();
        Cdac c1=new Cdac(500);
        Cdac c2=new Cdac(100,500);
    }
}
