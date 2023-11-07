
package javaAssignment;



import java.util.Date;

 class Student
{
    
    String name;
    int prnNo;
    
    public Student(String name,int prnNo)
    {
        this.name=name;
        this.prnNo=prnNo;
    }
    
}
 class Trainer  extends Student
{
    String tname;
    

  
  
  public Trainer(String name,int prnNo,String tname)
  {  
       
      super(name,prnNo);
      
      this.tname=tname;
      
  }
}


class Aassignment extends Trainer
{
    
  private  String title;
  private  Date date;
  private  String decription;
  private String assignee;

    public Aassignment(String name, int prnNo)
    {
       super(name,prnNo,tname);
      
    }
  
  public String gettitle()
  {
      return title;
  }
  public  void settitle(String title)
  {
      this.title=title;
  }
  
  public  Date getdate()
  {
      return date;
  }
  public void setdate(Date date)
  {
      this.date=date;
  }
  public String getdecription()
  {
      return decription;
  }
    
  public void setdecription(String decription)
  {
      this.decription=decription;
  }
    public String getassignee()
    {
        return assignee;
    }
    
    public void setassignee(String assignee)
    {
        this.assignee=assignee;
    }
    
    
}

public class AssignmentManager
{
    
    
        
    
//    int num;
//    Scanner sc=new Scanner(System.in);
//    void show()
//    {
//        switch(num)
//        {
//            
//        }
//       
//    
//}
     public static void main(String[] args)
{
//     LocalDate today=LocalDate.now();
    
       Aassignment aobj=new Aassignment("sangharsh ",10234);
       aobj.settitle("java");
//       aobj.setdate(today);
       aobj.setassignee("sangharsh");
       aobj.setdecription("jva programming");
       
       System.out.println(aobj.gettitle()+aobj.getassignee()+aobj.getdecription()+aobj.getdate());
       
        
    }
}



//switch( num)
//    {
//        case 1: public void createAssignment()
//        {
//           
//         
//               
//        }
//               break;
//        case 2:public void addAssignment()
//        {
//        }
//            break;
//        case 3: public void showAssignment()
//           {
//            
//             }
//            break;
//        case 4:public void saveAssignment(){
//            
//            }
//         break;
//}
