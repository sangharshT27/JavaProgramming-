/*7.Write a Java program to demonstrate multiple inner classes(Member,Local and Anonymous
Inner class).*/
package javaAssignment;


public class School {
    private String schoolName = "ABC School";

    // Member Inner Class
    public class Student {
        private String name;

        public Student(String name) {
            this.name = name;
        }

        public void display() {
            System.out.println("Student: " + name + " from " + schoolName);
        }
    }

    // Local Inner Class
    public void enrollStudentLocally(final String name) {
        class LocalStudent {
            public void display() {
                System.out.println("Local Student: " + name + " from " + schoolName);
            }
        }

        LocalStudent localStudent = new LocalStudent();
        localStudent.display();
    }

    // Anonymous Inner Class
    public void enrollStudentAnonymously(final String name) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Student: " + name + " from " + schoolName);
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    public static void main(String[] args) {
        School school = new School();

        // Member Inner Class
        School.Student student1 = school.new Student("Ramesh");
        student1.display();

        // Local Inner Class
        school.enrollStudentLocally("Suresh");

        // Anonymous Inner Class
        school.enrollStudentAnonymously("Ganesh");
    }
}
