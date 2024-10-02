package practice;
class Employee {
    int age;
    int monthlySalary;
    String name;

    public void insertRecord(int a,int mS,String n){
        age = a;
        monthlySalary = mS;
        name = n;
    }

    public void displayRecord(){
        System.out.println("Employee Name: "+name+"\nAge: "+age+"\nMonthly Salary: "+monthlySalary );
    }
}

public class P {
public static void main(){
    Employee emp = new Employee();

    emp.insertRecord(42,75000,"Thomas Logan");
    emp.displayRecord();
}
}
