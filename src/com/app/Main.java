package com.app;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Teacher Nancy = new Teacher(1, "Nancy", 9000);
        Teacher Melissa = new Teacher(3, "Melissa", 8000);
        Teacher George = new Teacher(2, "George", 8500);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Nancy);
        teacherList.add(Melissa);
        teacherList.add(George);

        Student Jesus = new Student(1, "Jesus", 9);
        Student Kehlani = new Student(2, "Kehlani", 12);
        Student Kayla = new Student(3, "Kayla", 9);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Jesus);
        studentList.add(Kehlani);
        studentList.add(Kayla);



        School panorama = new School(teacherList, studentList);

        Jesus.payFees(4000);
        Kehlani.payFees(6000);

        System.out.print("Panorama Middle School has earned $" + panorama.getTotalMoneyEarned() + "\n");

        Nancy.receiveSalary(Nancy.getSalary());
        System.out.print("Panorama has paid " + Nancy.getName() + " a total of $" + Nancy.getSalary() + "\n");

        System.out.println("Panorama has paid salaries and now has $" + panorama.getTotalMoneyEarned());







    }
}
