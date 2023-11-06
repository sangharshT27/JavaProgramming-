
package genericClass;
class Container<T>
{
    String contain;
    
    public Container(String contain)
    {
        this.contain=contain;
    }
    
    public String getContain()
    {
     return contain;
    }
    public void showType()
    {
        System.out.println(contain.getClass().getName());
    }
}

public class GenericClass {
    public static void main(String[] args) {
        Container<String> c=new Container<>("Cdac");
        String s=c.getContain();
        System.out.println(s);
//        System.out.println(c.getClass());
        c.showType();
        
        
    }
}
