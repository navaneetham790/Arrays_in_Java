package Day2;
import java.util.Scanner;
public class Exercise7 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Resume Summary: ");
	        String summary = sc.nextLine();
	        String[] words = summary.trim().split("\\s+");
	        System.out.println("Word Count: " + words.length);
	        sc.close();
	}
}
