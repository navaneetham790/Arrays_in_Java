package Day2;
import java.util.Scanner;
public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        double[] salaries = new double[n];
        System.out.println("Enter employee salaries:");
        for (int i = 0; i < n; i++) {
            salaries[i] = sc.nextDouble();
        }
        double highest = salaries[0];
        double lowest = salaries[0];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            if (salaries[i] > highest) {
                highest = salaries[i];
            }
            if (salaries[i] < lowest) {
                lowest = salaries[i];
            }
            sum += salaries[i];
        }
        double average = sum / n;
        int aboveAverageCount = 0;
        for (int i = 0; i < n; i++) {
            if (salaries[i] > average) {
                aboveAverageCount++;
            }
        }
        System.out.println("\nResults:");
        System.out.println("Highest Salary: " + highest);
        System.out.println("Lowest Salary: " + lowest);
        System.out.println("Average Salary: " + average);
        System.out.println("Employees Earning Above Average: " + aboveAverageCount);
        sc.close();
    }
}


