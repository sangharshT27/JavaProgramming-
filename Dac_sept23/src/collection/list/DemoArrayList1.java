
package collection.list;

import java.util.*;


public class DemoArrayList1 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Please enter 5 int data");
       ArrayList<Integer>al=new ArrayList<>();
//        for(int i=0;i<5;i++)
//        {
//            al.add(sc.nextInt());
//            
//        }
//        System.out.println(al);
        al.add(25);
        System.out.println(al);
       al.add(al.size()-1,65);
        System.out.println(al);
        al.remove((Object)25);
        System.out.println(al);
        
    }
}
