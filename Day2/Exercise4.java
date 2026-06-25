package Day2;
public class Exercise4 {
	public static void main(String[] args) {
		int[][] marks = {
	            {85, 90, 78, 88}, 
	            {92, 87, 95, 89}, 
	            {76, 80, 84, 79}  
	        };
	        int topperIndex = 0;
	        int highestTotal = 0;
	        for (int i = 0; i < marks.length; i++) {
	            int total = 0;
	            for (int j = 0; j < marks[i].length; j++) {
	                total += marks[i][j];
	            }
	            double average = (double) total / marks[i].length;
	            System.out.println("Student " + (i + 1));
	            System.out.println("Total Marks: " + total);
	            System.out.println("Average Marks: " + average);
	            System.out.println();
	            if (total > highestTotal) {
	                highestTotal = total;
	                topperIndex = i;
	            }
	        }
	        System.out.println("Topper Student Number: " + (topperIndex + 1));
	        System.out.println("Highest Total Marks: " + highestTotal);
	}

}
