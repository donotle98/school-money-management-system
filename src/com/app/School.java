package com.app;

import java.util.List;

/*
School contain:
Many teachers
Many students

Implements teachers and students using array list

 */

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;


    /*
    New school object is created
    @param teacher: list of teachers in school
    @param students: list of students in school
     */
    public School(List<Teacher> teacher, List<Student> student) {
        this.teachers = teacher;
        this.students = student;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }



    /*
    Returns list of teachers in school
     */
    public List<Teacher> getTeacher() {
        return teachers;
    }

    /*
    Adds a teacher to the school
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /*
    return the list of students from the school
     */
    public List<Student> getStudent() {
        return students;
    }

    /*
    Add a student to the school list
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /*
    Return total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /*
    Adds total money by the school
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /*
    Returns the total money spent
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /*
    Update money spent by the school
    Salary of teachers....
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
