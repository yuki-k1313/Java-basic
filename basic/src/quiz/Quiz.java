package quiz;

import java.util.Scanner;

public class Quiz {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double num1 = scanner.nextInt();
		double num2 = scanner.nextInt();
		double result = num1 / num2 * 1000;	
		int answer = (int) result;
		System.out.println(answer);
		
	}
	
}
