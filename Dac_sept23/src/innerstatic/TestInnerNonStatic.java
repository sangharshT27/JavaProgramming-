
package innerstatic;
class Outer
{
    int x=10;

 class InnerSatic
{
    int y=20;
    void display()
    {
               System.out.println("i'm am from non static inner class "+(x+y));
    }
            
}
}


public class TestInnerNonStatic
{
    public static void main(String[] args) 
    {
        Outer o=new Outer();

        Outer.InnerSatic obj= o. new InnerSatic();
        obj.display();
    }
    
    
}
