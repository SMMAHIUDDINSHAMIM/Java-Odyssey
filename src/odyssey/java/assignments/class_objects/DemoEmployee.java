package src.odyssey.java.assignments.class_objects;

public class DemoEmployee {
    public static void main(String[] args) {
       Employee_class objEmployee = new Employee_class();
        objEmployee.printfullName();
        System.out.println("Print full Info:");
        objEmployee.printInfo();

        Employee_class objEmployee1 = new Employee_class("1. S. M.","Shamim");
        objEmployee1.printInfo();

        Employee_class objEmployee2 = new Employee_class("2. S. M.","Shamim", "12/31/1988");
        objEmployee2.printInfo();

        Employee_class objEmployee3 = new Employee_class("3. S. M.","Shamim", "12/31/1988","SDET");
        objEmployee3.printInfo();

        Employee_class objEmployee4 = new Employee_class("4. S. M.","Shamim", "12/31/1988","SDET","IT");
        objEmployee4.printInfo();

    }
}
