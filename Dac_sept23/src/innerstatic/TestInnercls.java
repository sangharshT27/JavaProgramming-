
package innerstatic;
class Outer
{
    int x=10;

static class InnerSatic
{
    int y=20;
    void show() 
    {
        Outer o=new Outer();
        System.out.println(" am from static inner class "+(o.x+y));
    }
            
}
}

public class TestInnercls 
{
    public static void main(String[] args) 
    {
        Outer.InnerSatic obj=new Outer.InnerSatic();
        obj.show();
    }
    
    
}
