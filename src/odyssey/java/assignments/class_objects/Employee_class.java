package src.odyssey.java.assignments.class_objects;

public class Employee_class {
//    String fName = "S. M. ";
//    String lName = "Shamim";
//    String DoB = "12/31/1988";
//    String title = "SDET";
//    String department = "IT";
//
//    public void printfullName(){
//        System.out.println("Name: "+this.fName+this.lName);
//    }
//    public void personalInfo(){
//
//    }
    String fName= "S. M." ;
    String mName= "M";
    String lName = "Shamim";
    String DoB = "12/31/1988 ";
    String title  = "SDET ";
    String department = "IT ";
    public Employee_class(){
        this.fName = "S. M.";
        this.mName = "Khaled";
        this.lName = "Shamim";
        this.DoB = "12/31/1988 ";
        this.title = "SDET ";
        this.department = "IT ";
    }
    public Employee_class(String fname,String lname){
        this.fName = fname;
        this.lName = lName;
        this.DoB = "12/31/1988 ";
        this.title = "SDET ";
        this.department = "IT ";
    }
    public Employee_class(String fname, String lname, String dob){
        this.fName = fname;
        this.lName = lname;
        this.DoB = dob;
        this.title = "SDET ";
        this.department = "IT ";
    }
    public Employee_class(String fname, String lname, String dob, String title){
        this.fName = fname;
        this.lName = lname;
        this.DoB = dob;
        this.title = title;
        this.department = "IT ";
    }
    public Employee_class(String fname, String lname, String dob, String title, String department){
        this.fName = fname;
        this.lName = lname;
        this.DoB = dob;
        this.title = title;
        this.department = department;
    }

    public void printfullName(){
        System.out.println("Name: "+this.fName+" "+this.mName+" "+this.lName);
    }
    public void printInfo(){
        System.out.println("Name: "+this.fName+" "+this.lName);
        System.out.println("DoB: "+ DoB);
        System.out.println("Title: "+title);
        System.out.println("Department: "+department);
    }
}
