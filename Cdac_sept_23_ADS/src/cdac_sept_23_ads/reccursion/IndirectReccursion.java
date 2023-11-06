
package cdac_sept_23_ads.reccursion;


public class IndirectReccursion {
    static int i=1;
    static void even(int n)
    {
        if(n>10)
            return;
        
        System.out.println("Even:"+n);
        odd(++n);
        
    }
    static void odd(int n)
    {
        if(n>10)
        {
            return;
        }
        System.out.println("odd:"+n);
        even(++n);
    }
    public static void main(String[] args) {
       even(1);
    }
}


