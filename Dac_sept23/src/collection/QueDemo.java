
package collection;

import java.util.Iterator;
import java.util.PriorityQueue;


public class QueDemo 
{
    public static void main(String[] args) {
        
    
    PriorityQueue<Student> v=new PriorityQueue<>(new StudentSortingByName());
    
        Student s1=new Student(102,"Ramesh", 23);
        Student s2=new Student(101,"Bhavesh", 28);
        Student s3=new Student(105,"Mahesh", 25);
        Student s4=new Student(103,"Dinesh", 21);
        
        v.add(s1);
        v.add(s2);
        v.add(s3);
        v.add(s4);
        
        Iterator<Student> it=v.iterator();
        while(it.hasNext())
        {
             Student s=it.next();
            System.out.println("Id:"+s.getId()+",Name:"+s.getName()+",Age"+s.getAge());
        }
        
    }  
}
