//Q2.Write a java program to Implement Queue data structure using
//LinkedList and Queue collection.
package javalabtaskday18;

import java.util.LinkedList;
import java.util.Queue;


public class QueueImplement {
    public static void main(String[] args) {
        
        Queue<String> queue=new LinkedList<>();
        
        queue.add("Sangharsh");
        queue.add("Kshitij");
        queue.add("Devashish");
        
        
        System.out.println("Queue:"+queue);
        
        System.out.println("Remove String 1:"+queue.poll());
        System.out.println("Remove String 1:"+queue.poll());
        
        System.out.println(queue);
    }
}
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//class Employee implements Comparable<Employee> {
//    private int id;
//    private String name;
//
//    public Employee(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public int compareTo(Employee other) {
//        return Integer.compare(this.id, other.id);
//    }
//
//    @Override
//    public String toString() {
//        return "Employee [id=" + id + ", name=" + name + "]";
//    }
//
//    // Comparator for sorting employees by name
//    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
//        @Override
//        public int compare(Employee emp1, Employee emp2) {
//            return emp1.getName().compareTo(emp2.getName());
//        }
//    };
//}
//
//public class EmployeeSortingExample {
//    public static void main(String[] args) {
//        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee(101, "John"));
//        employees.add(new Employee(103, "Alice"));
//        employees.add(new Employee(102, "Bob"));
//
//        System.out.println("Employees before sorting by ID:");
//        for (Employee emp : employees) {
//            System.out.println(emp);
//        }
//
//        Collections.sort(employees); // Sorting by ID using Comparable
//
//        System.out.println("\nEmployees after sorting by ID:");
//        for (Employee emp : employees) {
//            System.out.println(emp);
//        }
//
//        // Sorting by name using Comparator
//        Collections.sort(employees, Employee.NameComparator);
//
//        System.out.println("\nEmployees after sorting by Name:");
//        for (Employee emp : employees) {
//            System.out.println(emp);
//        }
//    }
//}
