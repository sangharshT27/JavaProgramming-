import java.util.Scanner;
public class Divisible
{
	
	void check()
	
	{   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		if(num%8==0 && num%5==0)
		{
			System.out.println(num+" is divisible by 8 & 5");
			
		}
		else if(num%8==0)
		{
			System.out.println(num+" is divisible by 8");
		}
		else if(num%5==0)
		{
			System.out.println(num+" is divisible by  5");
		}
		else if(num%8==0 || num%5==0)
		{
			System.out.println(num+" is divisible by 8 Or 5");
		}
		else
		{
			System.out.println(num+" is not divisible by 8 & 5");
		}
	}
	
	 public static void main(String ar[])
	 {
		 Divisible d=new Divisible();
		 d.check();
		 
	 }
	
	
}