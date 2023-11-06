import java.util.Scanner;

 class Marks
{
     
  
   void show()
   { 
      int total_marks=0;
	  int percentage;
      int m1,m2,m3,m4,m5;
      Scanner sc=new Scanner(System.in);
   
  
       System.out.println("enter the marks paper1:");
        m1=sc.nextInt();
	   System.out.println("enter the marks paper2:");
        m2=sc.nextInt();
	   System.out.println("enter the marks paper3:");
        m3=sc.nextInt();
	   System.out.println("enter the marks paper1:");
        m4=sc.nextInt();
	   System.out.println("enter the marks paper1:");
        m5=sc.nextInt();
	   
	   total_marks=m1+m2+m3+m4+m5;
	   
	   System.out.println("total marks of student"+total_marks);
	   
	   percentage=(total_marks/250)*100;
	   
	  
	 System.out.println("percentage:"+percentage);
	 
	 
	 if(percentage>=90)
	 {
	     System.out.println("grade is A");
	 }
	 else if(percentage>=80)
	 {
	 }
	  else if(percentage>=70)
	 {
	 }
	  else if(percentage>=60)
	 {
	 }
	  else if(percentage>=50)
	 {
	 }   
     else
	 {
	   System.out.println("fail");
	 }	 
    } 
	 public static void main(String ar[])
     {
	      Marks m=new Marks();
		  m.show();
		  
     }	 
       
   }
   


