
package javaLabtask;


public class CountVowCon {
    public static void main(String[] args) 
    {
        
        String s="Sangharsh";
        char a[]=s.toCharArray();
        int count=0;
        int cons=0;
        
        for(int i=0;i<a.length;i++ )
        {
            if(a[i]=='a' || a[i]=='e'|| a[i]=='o' || a[i]=='u')
            {
                  System.out.println("vowels:"+a[i]);
                  count++;
            }
            else
            {
                System.out.println("consonants:"+a[i]);
                cons++;
            }
          
        }
        
        System.out.println("vowels count are:" +count);
        System.out.println("consonants count are:" +cons);
        
    }
    
}
