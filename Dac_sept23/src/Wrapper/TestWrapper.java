

package Wrapper;


public class TestWrapper {
    
    public static void main(String[] args)
    {
        int x=10;
        
        
        Integer i=x;//Autoboxinig
        
        int a=x;//Autounboxing
        
        
        System.out.println("primitive x:"+x);
        System.out.println("Refrence x:"+a);
        
        String age="25";
        int age1=Integer.parseInt(age);
        System.out.println(age1+5);
        
        
    }
}
