
package collection.list;

import java.util.*;


public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Object>lls=new LinkedList<>();
        lls.add(10);
        lls.add("sangharsh");
        lls.add(10); // Insertion order is maintained
lls.add("Java"); // Hetergeneous data is allowed
lls.add(null); // null is allowed
lls.add(45); // Duplicates are allowed
lls.add(85); // It is available from Java 1.2v
lls.add(12); // Its default capacity is 0
lls.add(1); // Its size increases by DOUBLE
lls.add(10); // It is NOT SYNCHRONIZED
System.out.println(lls);

ListIterator<Object>li=lls.listIterator();
while(li.hasNext())
{
    System.out.println(li.next()+" ");
}

while(li.hasPrevious())
{
    System.out.println(li.previous()+" ");
}
        
    }
}
