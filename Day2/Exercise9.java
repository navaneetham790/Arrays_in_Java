package Day2;
public class Exercise9 {
    int employeeId;
    String employeeName;
    String department;
    int salary;
    Exercise9(int employeeId, String employeeName, String department, int salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }
    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args) {
        Exercise9 emp = new Exercise9(101, "Navaneetha", "AD", 35000);
        emp.displayEmployee();
    }
}