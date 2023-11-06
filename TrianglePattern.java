import java.util.Scanner;
public class TrianglePattern
{
   void equilateralTriangle()
   {
	   
     for(int i=0;i<5;i++)
	 {
	 for(int j=4;j>i;j--)
	   {
	      System.out.print(" ");
	   }
	   for(int j=0;j<=4;j++)
	   {
	      System.out.print("* ");
	   }
	   System.out.println("");
	 }
      
   }
   
   public static void main(String ar[])
   {
   
       TrianglePattern t= new TrianglePattern();
	   t.equilateralTriangle();
   }
}