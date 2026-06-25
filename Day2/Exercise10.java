package Day2;
public class Exercise10 {
	public static void main(String[] args) {
		Employee emp = new Employee("Navaneetha", 19, 101, "AD");
        emp.displayDetails();
	}
}
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person {
    int employeeId;
    String department;
    Employee(String name, int age, int employeeId, String department) {
        super(name, age); // Initialize parent class variables
        this.employeeId = employeeId;
        this.department = department;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}