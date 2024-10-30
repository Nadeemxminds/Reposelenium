package training04;

import java.util.Scanner;

public class SwitchCalculatorExample{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter an operator (+, -, *, /) ");
		char operator = sc.next().charAt(0);
        

     // You can use this operator 
        int num1 = 10, num2 = 5, result = 0;
        
        switch (operator){
        	case '+':
        	result = num1 + num2;
        	break;
        	case '-':
        	result = num1 - num2;
        	break;
        	case '*':
        	result = num1 * num2;
        	break;
        	case '/':
        	result = num1 / num2;
        	break;
        }
        sc.close();
	}
        	
 	
        	
        
        
			
	}
}