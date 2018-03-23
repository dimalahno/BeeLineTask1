import sum_numbers.SumNumbers;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {

		SumNumbers numbers = new SumNumbers();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input first number: ");
		String number1 = scanner.next();
		System.out.println("Input second number: ");
		String number2 = scanner.next();
		System.out.println("The sum of two numbers: ");
		System.out.println(numbers.sumLargeNumber(number1, number2));
		scanner.close();
	}
}
