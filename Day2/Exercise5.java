package Day2;
public class Exercise5 {
	public static void main(String[] args) {
        int[][] marks = {
                {80, 75, 90, 85}, 
                {70, 88, 92, 81}, 
                {95, 89, 85, 90} 
            };
            int topper = 0;
            int maxTotal = 0;
            for (int i = 0; i < 3; i++) {
                int total = 0;
                for (int j = 0; j < 4; j++) {
                    total += marks[i][j];
                }
                double average = (double) total / 4;
                System.out.println("Student " + (i + 1));
                System.out.println("Total Marks = " + total);
                System.out.println("Average Marks = " + average);
                if (total > maxTotal) {
                    maxTotal = total;
                    topper = i + 1;
                }
                System.out.println();
            }
            System.out.println("Topper Student Number = " + topper);
	}
}
