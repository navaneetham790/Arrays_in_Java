package Day2;
import java.util.Scanner;
public class Exercise8 {
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Mobile Number: ");
	        String mobile = sc.nextLine();
	        StringBuffer sb = new StringBuffer(mobile);
	        for (int i = 0; i < 6; i++) {
	            sb.setCharAt(i, '*');
	        }
	        System.out.println("Masked Number: " + sb);
	        sc.close();
	}
}
