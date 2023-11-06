
package overloading;
import java.util.Scanner;

public class RouteFinder 
{
    public void route(String src,String via,String dest)
    {
         System.out.println("Moving from "+src+"to"+dest+"via"+via);
         
    }
   public void route(String src,String dest)
    {
         System.out.println("Moving from"+src+" To"+dest );
    }
   public void route(String dest)
    {
         System.out.println("Moving to "+dest);
    }
  
    public static void main(String[] args)
    {
        RouteFinder rf=new RouteFinder();
        System.out.println("Please enter");
         System.out.println("1.for Destination only");
          System.out.println("2.for source anddestination");
           System.out.println("3.for source via and destination");
           
           Scanner sc=new Scanner(System.in);
           Scanner sc1=new Scanner(System.in);
           
           
         int choice=sc1.nextInt();
         switch(choice)
         {
             case 1 ->              {
                 System.out.println("Enter Destination");
                 String d=sc.nextLine();
                 rf.route(d);
             }
             case 2 -> {
                 System.out.println("Enter the source and destination");
                 String s=sc.nextLine();
                 String d=sc.nextLine();
                 rf.route(s,d);
             
                 }
             case 3 -> {
                 System.out.println("Enter the source,via and destination");
                 String s=sc.nextLine();
                 String v=sc.nextLine();
                 String d=sc.nextLine();
                 rf.route(s,v,d);
             }
             default -> System.out.println("please Enter the correct city");
             }
                   
        
    }
    
}
