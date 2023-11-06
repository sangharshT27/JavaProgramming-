
package cdac_sept_23_ads.reccursion;


public class ReccursionEx {
    
    int fact(int n)
    {
        
        if(n==1)
            return 1;
        
        return n*fact(n-1);
        
        
    }
    public static void main(String[] args) {
        ReccursionEx r=new ReccursionEx();
        System.out.println( r.fact(10));
    }
}
