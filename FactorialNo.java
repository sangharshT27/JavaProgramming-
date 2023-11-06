import java.util.Scanner;
public class FactorialNo
{
   int num,f=1;
   
   void checkF()
   {  
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int num=sc.nextInt();
	  while(num>0)
	  
	  {
	      f*=num;
		    --num;
		
		  
	  }
	
	  
	  System.out.println("Factorial is"+f);
   }
   public static void main(String ar[])
   {
       FactorialNo f=new FactorialNo();
	   f.checkF();
   }
}