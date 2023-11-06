/*1.Build a class which has references to other classes. Instantiate these reference variables and
invoke instance methods.
*/
package javaAssignment;

class AddressInfo
{

    String  stret;
    String city;
    String state;
    String pincode;
    
    
    public AddressInfo(String  stret,String city, String state,String pincode)
    {
        this.stret=stret;
        this.city=city;
        this.state=state;
        this.pincode=pincode;
    }
    public String displayaddress()
    {
        return stret+","+city+","+state+","+pincode;
    }
    
}
class Person
{
    String name;
    int age;
    AddressInfo addressinfo;
    
    public Person(String name,int age,AddressInfo addressinfo)
    {
        this.name=name;
        this.age=age;
        this.addressinfo=addressinfo;
    }
    
    public String displayInfo()
    {
       return "Name: " + name + ", Age: " + age + "\nAddress: " + addressinfo.displayaddress() ;
    }
}
public class Address {
    public static void main(String[] args)
    {
        AddressInfo aobj=new AddressInfo("101","nagpur","MH","440022");
        Person pobj=new Person("sangharsh",24,aobj);
    }
}
