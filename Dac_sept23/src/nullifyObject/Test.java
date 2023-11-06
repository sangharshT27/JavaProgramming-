
package nullifyObject;


public class Test 
{
    protected void finalize()
    {
       System.out.println("Object is destroyed");
    }
    public static void main(String[] args) 
    {
        Test t=new Test();
        t=null;
        System.gc();
    }
}
