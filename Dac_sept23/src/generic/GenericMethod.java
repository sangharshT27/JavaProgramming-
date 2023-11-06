package generic;

import java.util.List;

public class GenericMethod {
    
//    public static void showData (<? extends Number>  arr[])
    //Upper Bound
//            public static void showData (List<? extends Number>  arr[])
//    {
//        for(Number s:lst)
//            
//        {
//            System.out.println(s);
//        }
//    }
      //Lower Bond      
        public static void showData (List<? super Integer> arr[])
    {
        for(Object s:lst)
            
        {
            System.out.println(s);
        }
    }    
    
//     public static void showData(Integer arr[])
//    {
//        for(Integer s:arr)
//        {
//            System.out.println(s);
//        }
//    }
    
    
    public static void main(String[] args) {
//        String names[]={"Ramesh","Suresh","Dinesh","Mahaesh"};
//        
//       Integer i[]={23,34,67,87};
//       
//        showData(names);
//        showData(i);
        
        
        List lst=List.of("Ramesh","Suresh","Dinesh","Mahaesh");
        List lst1=List.of(23,34,67,87);
        showData(lst);
        showData(lst1);
    }
}
