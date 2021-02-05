  import java.util.Scanner;

/**
 * 
 * @author Sophia Garcia
 * created 2/4/21
 */

public class Exercise {
	public static void main(String[] args) {
	System.out.print("Welcome! ");
	Scanner sc = new Scanner(System.in); 
	System.out.println("Enter your first name: ");
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int firstNum = sc.nextInt();
	System.out.print("Enter second number: ");
	int secondNum = sc.nextInt();
	System.out.print("Enter third number: ");
	int thirdNum = sc.nextInt();
		
	int product = firstNum * secondNum * thirdNum;
	int sum = firstNum + secondNum + thirdNum;
		
	System.out.println("Product: " + product);
				
	System.out.println("Sum: " + sum);
		 
	}
}
