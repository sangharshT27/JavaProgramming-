import java.util.Scanner;

public class FibonacciSeries 
{
    
	 void showF()
	 {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the series");
        int num = sc.nextInt();
        int a = 0, b = 1;
        System.out.println("First " + num + " terms of the Fibonacci series are: ");

        for (int i = 1; i <= num; ++i) 
		{
            System.out.print(a + " ,");

            int sum = a + b;
            a = b;
            b = sum;
        }
	 }	
		 public static void main(String[] args)
		 {
		    FibonacciSeries fs=new FibonacciSeries();
			fs.showF();
		 
		 }
	 
    }
	

