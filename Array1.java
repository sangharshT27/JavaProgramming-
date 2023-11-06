
import java.util.Scanner;

public class Array1
{
	
		int arr[][]=new int[3][];
		
		
		void takeinput()
		{
			
			arr[0]=new int[5];
		    arr[1]=new int[3];
		    arr[2]=new int[3];	
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter "  +(arr[0].length+arr[1].length+arr[2].length.arr[3].length\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\)+" nos");
			for(int i=0;i<arr[i].length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					arr[i][j]=sc.nextInt();
					
				}
			}
			showoutput();
		}

		void showoutput()
		{
			System.out.println("\n\nOutput array is.....");
			for(int i=0;i<arr[i].length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					System.out.println("arr[i][j]+\t");
				}
				System.out.println("");
			}
		}	
 	
	public static void main(String ar[])	
	{	
		Array1 aobj=new Array1();
		aobj.takeinput();
	}
		
}