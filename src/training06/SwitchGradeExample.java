package training06;

import java.util.Scanner;

public class SwitchGradeExample{
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's score (0-100): ");
        int score = scanner.nextInt();
        
        char grade;
        
        switch (score/10) {
        case 9:
        	grade= 'A';
        	break;
        case 8:
        	grade= 'B';
        	break;
        case 7:
        	grade= 'C';
        	break;
        case 6:
        	grade= 'D';
        	break;
        case 5:
        	grade= 'E';
        	break;
        case 4:
        	grade= 'F';
        	break;
        	
        default:
            System.out.println("Invalid score.");
            return;
            
        }

        System.out.println("The student's grade is: " + grade);
    }

        	
        
        
	}
