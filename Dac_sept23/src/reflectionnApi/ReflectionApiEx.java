
package reflectionnApi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Person
{
    private String name;
    private int age;
    
    
     public Person(String name,int age)
     {
         this.name=name;
         this.age=age;
         
     }
     private void showInfo()
     {
         System.out.println("Hello "+name+", your Age is "+age);
     }
}
public class ReflectionApiEx {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
      //Reference of class
        Class PersonCls=Person.class;
        
        Constructor cons=PersonCls.getDeclaredConstructor(String.class,int.class);
        Object obj=cons.newInstance("Ramesh",25);
        
        Field fname=PersonCls.getDeclaredField("name");
        fname.setAccessible(true);
        fname.set(obj, "suresh");
        
        Method m=PersonCls.getDeclaredMethod("showInfo");
        
        m.setAccessible(true);
        m.invoke(obj);
        
        
       String s= (String)fname.get(obj);
       
        System.out.println(s);
        
        Field fage=PersonCls.getDeclaredField("age");
        fage.setAccessible(true);
        int ag=fage.getInt(obj);
        System.out.println(ag);
       
    }
}
