
package collection.list;

import java.util.*;


public class VectorEx {
    public static void main(String[] args) {
        Vector<Object>v=new Vector<>();
        System.out.println("Capacity:"+v.capacity());
        v.add(10);
        v.add("sangharsh");
        System.out.println(v);
        v.add(null);// null is allowed
v.add(1); // duplicates are allowed
v.add(56);// It is available from Java 1.0v
//[LEGACY CLASS]
v.add(100);// Default capacity is 10
v.add(12); // Its size increases by DOUBLE
v.add(10); // IT IS SYNCHRONIZED
v.add(35);
System.out.println(v);
System.out.println("Capacity : "+v.capacity());//10
System.out.println("Size() : "+v.size());//9
System.out.println("---------------------");

Enumeration<Object>en=v.elements();
while(en.hasMoreElements())
{
    System.out.println(en.nextElement());
}

v.add(true);

v.add('A');
System.out.println("Capacity : "+v.capacity());
        System.out.println(v);
    }
}
