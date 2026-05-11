package OOPS.InnerClass;

class College {

    String collegeName = "KodNest College";

    // Inner Class
    class Student {

        String studentName = "Nikhil";

        void display() {

            // Accessing outer class variable
            System.out.println("College Name: " + collegeName);

            // Accessing inner class variable
            System.out.println("Student Name: " + studentName);
        }
    }
}

public class InnerClass {

    public static void main(String[] args) {

        // Create outer class object
        College c = new College();

        // Create inner class object
        College.Student s = c.new Student();

        s.display();
    }
}
