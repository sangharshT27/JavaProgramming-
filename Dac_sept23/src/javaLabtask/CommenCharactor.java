
package javaLabtask;


public class CommenCharactor 
{
    public static void main(String[] args)
    {
        String s="sangharsh";
        String n="prajwaal";
        
        char a[]=s.toCharArray();
        char b[]=n.toCharArray();
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;i<b.length;j++)
            {
                if(a[i]==b[j])
                {
                    System.out.println(a[i]+",");
                }
            }
        }
    }
}
