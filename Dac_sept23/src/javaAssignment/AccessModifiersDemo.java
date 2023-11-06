//6.Write a java program to create a demo application to understand the role of access modifiers.

package javaAssignment;



class MyClass {
  
    public int publicVar;

    public void publicMethod() {
        System.out.println("This is a public method.");
    }

   
    protected int protectedVar;

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

 
    int defaultVar;

    void defaultMethod() {
        System.out.println("This is a default method.");
    }


    private int privateVar;

    private void privateMethod() {
        System.out.println("This is a private method.");
    }
}
public class AccessModifiersDemo {
    public static void main(String[] args) {
       
        MyClass myClass = new MyClass();

      
        myClass.publicVar = 10; 
        myClass.protectedVar = 20; 
        myClass.defaultVar = 30; 
    

        myClass.publicMethod(); 
        myClass.protectedMethod(); 
        myClass.defaultMethod(); 
      
    }
}