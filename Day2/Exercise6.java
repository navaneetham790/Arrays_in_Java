package Day2;
import java.util.Scanner;
public class Exercise6 {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Email: ");
	        String email = sc.nextLine();
	        if (email.endsWith("@company.com")) {
	            System.out.println("Valid Company Email");
	        } else {
	            System.out.println("Invalid Company Email");
	        }
	        sc.close();	
	}
}
