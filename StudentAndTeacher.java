
package Assigment11;

import java.util.Date;
import java.util.Scanner;
import javax.xml.transform.Source;

public class StudentAndTeacher {

  class Student extends Person {

        String major;

        
        public Student(String id, String homeTown, Date dateOfBirth, String major) {
            super(id, homeTown, dateOfBirth);
            this.major = major;
        }

        public void displayInfo() {
            super.displayInfo();
            System.out.println("Major: " + major);
        }

        public void addPerson() {
            super.addPerson();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Major: ");
            major = scanner.nextLine();
        }

        public boolean editPerson() {
            super.editPerson();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Edit Major: ");
            major = scanner.nextLine();
            return true;
        }
    }
    
    class Teacher extends Person {

        String department;


        public Teacher(String id, String homeTown, Date dateOfBirth, String department) {
            super(id, homeTown, dateOfBirth);
            this.department = department;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Department: " + department);
        }

        @Override
        public void addPerson() {
            super.addPerson();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Department: ");
            department = scanner.nextLine();
        }

        @Override
        public boolean editPerson() {
            super.editPerson();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Edit Department: ");
            department = scanner.nextLine();
            return true;
        }
    }
}
