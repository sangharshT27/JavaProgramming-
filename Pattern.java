import java.util.Scanner;
public class Pattern
{
  
   void printRightTriangle()
   {
     int row=5;
	 for(int i=1;i<=row;i++)
	 {  
	 for(int j=1;j<=i;j++)
	 { 
	   System.out.print(" *");
	 }
	 System.out.println();
	 }
       
   }
   
    void printInvertedTriangle()
   {
     int row=5;
	 for(int i=1;i<=row;i++)
	 {  
	 for(int j=row;j>=i;j--)
	 { 
	   System.out.print(" *");
	 }
	 System.out.println();
	 }
       
   }

public static void main(String ar[])
{
   
   Pattern p1=new Pattern();
   Pattern p2=new Pattern();

   p1.printRightTriangle();
   p2.printInvertedTriangle();
}

}