
package overloading;
public class Parameterized 
{
    int a,b,c;
    Parameterized(int x,int y)
    {
        a=x;
        b=y;
        c=a+b;
        System.out.println("addition is :"+c);
    }
    public static void main(String[] args) 
    {
        Parameterized p=new Parameterized(10,20);
        
    }
}
