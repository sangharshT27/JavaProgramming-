package dac_sept23;

 class Employee {
    String name;
    int id;

    
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    
    public void printEmployee() {
        System.out.println("Employee Name: " + this.name + ", ID: " + this.id);
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
        Employee[] employees = new Employee[3];


        employees[0] = new Employee("John Doe", 1);
        employees[1] = new Employee("Jane Doe", 2);
        employees[2] = new Employee("Jim Doe", 3);

        
        for (Employee employee : employees) {
            employee.printEmployee();
    }
}
}