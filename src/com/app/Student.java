package com.app;
//
//class responsible for keeping track of students
//student fees, fees paid, name, id, grade,
//

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    /*
    To create a new student by initializing
    Fees for every student is going to be $30,000 per year
    Fees paid initially is $0
    @param id: id of the student, unique to each student
    @param name: name of student
    @param grade: grade of student
    */
    public Student(int id, String name,int grade){
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //Never alter student's name, id


    /*
    Used to update student's grade
    @param grade: new grade of student
     */
    public void setGrade(int grade){
        this.grade = grade;
    }


    /*
    Keep adding fees to feesPaid field
    Add the fees to the fees paid
    School is going to receive the funds
    @param fees: the fees that the student pays
     */
    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }


    /*
    Return the id of student
     */
    public int getId() {
        return id;
    }


    /*
    Return the name of student
     */
    public String getName() {
        return name;
    }


    /*
    Return the grade of the student
     */
    public int getGrade() {
        return grade;
    }


    /*
    Return the fees paid by student
     */
    public int getFeesPaid() {
        return feesPaid;
    }


    /*
    Return the fees total of the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /*
    Return the remaining fees
    */
    public int getRemainingFees() {
        return feesTotal - feesPaid;

    }
}
