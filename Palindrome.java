import java.util.Scanner;
public class Palindrome
{
	void checkPalindrome()
	{
		Scanner sc=new Scanner(System.in);
		int rev=0;
		int temp,rem,num;
		
		System.out.println("enter the number");
		num=sc.nextInt();
		
		temp=num;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("reverse number is "+rev);
		
		if(temp==rev)
		{
			System.out.println("is palindrome");
		}
		else
		{
			System.out.println("is not palindrome");
		}
	}
	public static void main(String ar[])
	{
		Palindrome p=new Palindrome();
		p.checkPalindrome();
	}
	
}