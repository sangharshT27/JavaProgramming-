
package compositon;

class Engine 
    {
    private final String type;
    private final int horsePower;

    Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }
    
    void engDetails()
    {
        System.out.println("Engine type is:"+type);
        System.out.println("hosrepower of engine is:"+horsePower);
    }

   
}

class Car
{
   final private String carname;
    final   private Engine engine;
    
    public Car(String carname,Engine engine)
    {
        this.carname=carname;
        this.engine=engine;
    }
    
    public void  carDetails()
    {
        System.out.println("car name is :"+carname);
        System.out.println("engine  is:"+engine);
        
        
             
    }
    
}
public class TestComposition 
{
    public static void main(String[] args) 
    {
         Engine engn = new Engine("Petrol", 300);

        Car car = new Car("Ford", engn);

       
    }
    
}
