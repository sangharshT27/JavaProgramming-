
package interfaceexample;


public interface studentInter 
{
    int a=10;
    void showNAME(String name);
    Void showAge(int age);
    
    default void  course()
    {
        System.out.println("default method of interface");
        System.out.println("private default method of interface"+exam());
        
    }
    public  static void  insitute()
    {
     System.out.println("private default method of interface"+city());    
     
}
    private String  exam()
    {
        return "CET";
    }
    private static String city()
    {
            return "nagpur";
    }

}