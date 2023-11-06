/* 2.Write a program in java to create a class name studinfo accept the student
information by the member method getdata and inherit it in the base class name marks create
method to get marks in derived class and calculate the percentage and display the complete
information of student do this for three students.*/

package javaAssignment;
import java.util.Scanner;

class studinfo {
    String name, rollNo;
    int age;

    
    void getdata() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        name = input.nextLine();
        System.out.print("Enter student's roll number: ");
        rollNo = input.nextLine();
        System.out.print("Enter student's age: ");
        age = input.nextInt();
    }
}

class marks extends studinfo {
    double marksObtained;
    double totalMarks;

    
    void getMarks() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks obtained: ");
        marksObtained = input.nextDouble();
        System.out.print("Enter total marks: ");
        totalMarks = input.nextDouble();
    }

    double calculatePercentage() {
        return (marksObtained / totalMarks) * 100;
    }

    
    void displayInfo() {
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Age: " + age);
        System.out.println("Marks Obtained: " + marksObtained);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + calculatePercentage() + "%");
    }
}

public class StudentInfo {
    public static void main(String[] args) {
        marks[] students = new marks[3];

        for (int i = 0; i < 3; i++) {
            students[i] = new marks();
            System.out.println("Enter information for Student " + (i + 1) + ":");
            students[i].getdata();
            students[i].getMarks();
        }

    
        for (int i = 0; i < 3; i++) {
            students[i].displayInfo();
        }
    }
}
