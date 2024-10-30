package training;

public class Percentage {
	public static void main(String[]args) {
		 int totalScore=500;
		 int markObtained=360;
		 
		 //Calculate the percentage
		 double percentage =(double)markObtained/totalScore * 100;
		 
		 //Print the percentage
		System.out.println("Percentage.:" +percentage+ "%"); 
		if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else if (percentage >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }
    }
}
