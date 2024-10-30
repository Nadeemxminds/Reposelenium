package training03;

import java.util.Scanner;

public class SwitchMonthExample{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String month = sc.next();
		switch(month)
		{
		case "1":
			System.out.println("Januvary");
			break;
		case "2":
			System.out.println("Februvary");
			break;
		case "3":
			System.out.println("March");
			break;
		case "4":
			System.out.println("April");
			break;
		case "5":
			System.out.println("May");
			break;
		case "6":
			System.out.println("June");
			break;
		case "7":
			System.out.println("July");
		case "8":
			System.out.println("August");
			break;
		case "9":
			System.out.println("September");
			break;
		case "10":
			System.out.println("October");
			break;
		case "11":
			System.out.println("November");
			break;
		case "12":
			System.out.println("December");
			break;
		}
		sc.close();
	}
	
}