
package collection;


import java.util.*;
public class StudentCollection {
    public static void main(String[] args) 
    {
        Vector<Student> v=new Vector<>();
        Student s1=new Student(102,"Ramesh",23);
        Student s2=new Student(101,"Suresh",28);
        Student s3=new Student(105,"Bhavesh",25);
        Student s4=new Student(103,"Dinesh",21);
        
        v.add(s1);
        v.add(s2);
        v.add(s3);
        v.add(s4);
        
        
        
       StudentSortingByName ssbn=new StudentSortingByName();
        
        Collections.sort(v,ssbn);
       // Collections.sort(v);
        
       // System.out.println(v.get(3).getName());
       // System.out.println(v.get(3).getAge());
       
       Iterator<Student> it=v.iterator();
       while(it.hasNext())
       {
           Student s=it.next();
           System.out.println("ID:"+s.getId()+"Name"+s.getName()+"Age"+s.getAge());
       }
        
        
    }
}
