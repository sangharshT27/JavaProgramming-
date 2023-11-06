
package streamApi;

import java.util.*;
import java.util.Set;
import java.util.stream.Collectors;


public class StreamApiDemo {
    public static void main(String[] args) {
        
//        List<String> lst=List.of("Ramesh","Suresh","Dinesh","Bhavesh","Mahesh");
        
//        for(String s:lst)
//        {
//            System.out.println(s);
//        }
//        
        System.out.println("******************************");
//        lst.stream().forEach(e->System.out.println(e));
//         lst.stream().forEach(System.out::println);
         List<Integer>lst=List.of(12,11,10,24,22,45,56,22);
         System.out.println(lst);
         
       List<Integer>evenList= lst.stream().filter(i->i%2==0).collect(Collectors.toList());
       System.out.println(evenList);

//lst.stream().map(i->i+5).forEach(System.out::println);

//Set<Integer>st=lst.stream().map(i->i+5).collect(Collectors.toSet());
////
//       System.out.println(st);


//lst.stream().sorted((x,y)->y.compareTo(x)).forEach(System.out::println);



//        Integer i=lst.stream().min((x,y)->x.compareTo(y)).get();
//        System.out.println(i);
//       
//        String arr[]={"Ramesh","Suresh","Dinesh","Mahesh"};
//        Arrays.stream(arr).filter(e->e.startsWith("R")).forEach(System.out::println);
    }
            
}
