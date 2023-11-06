
package collection;

import java.util.PriorityQueue;


public class QueDemo1 {
    public static void main(String[] args) 
    {
        PriorityQueue<String> pq=new PriorityQueue<>();
        
        pq.add("Ramesh");
        pq.add("Suresh");
        pq.add("Bhavesh");
        pq.add("Mahesh");
        pq.add("Dinesh");
        
        System.out.println(pq);
        System.out.println("---------------------");
        
        String s1=pq.poll();
        System.out.println(s1);
        String s2=pq.poll();
        System.out.println(s2);
        String s3=pq.poll();
        System.out.println(s3);
        
        String s4=pq.poll();
        System.out.println(s4);
        
        String s5=pq.poll();
        System.out.println(s5);
        
//        String s=pq.peek();
//        System.out.println(s);
//        
//        System.out.println(pq);
        
    }
}
