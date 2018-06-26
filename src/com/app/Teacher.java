package com.app;


/*
This class is responsible for keeping track of teacher's name, id, and salary.
 */


public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /*
    Creates a new teacher object
    @param id: id for teacher
    @param name: name for teacher
    @param salary: salary for teacher
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }



    /*
    Returns the id for current teacher
     */
    public int getId(){
        return this.id;
    }


    /*
    Return name of teacher
     */
    public String getName(){
        return this.name;
    }


    /*
    Return salary of the teacher
     */
    public int getSalary(){
        return this.salary;
    }

    /*
    Setting the salary of the teacher
     */
    public void setSalary(int salary){
        this.salary = salary;
    }


    /*
    adds to the salary
    removes from the total money earned by school
     */
    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }
}

