
package stringexample;

import java.util.Scanner;

public class ValidateName 
{
    public static void main(String[] args) 
    {
        String s1;
        String s2;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your Name:");
         s1=sc.next();
         System.out.println("Re-Enter your Name");
         s2=sc.next();
         
         if(s1.equals(s2))
         {
             System.out.println("Name validate sucessfully ");
             
         }
         else
         {
             System.out.println("name is invalid");
         }
        
       
    }
}
