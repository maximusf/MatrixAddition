import java.util.Scanner;

public class Lab5_CalculatorMethods {

	public static void println(String str) {
		System.out.println(str);
	}

	public static double getDouble(String prompt) {
		Scanner input = new Scanner(System.in);
		println(prompt);
		double num = input.nextDouble();
		input.close();
		return num;
	}

	private static double sum(double a, double b) {
		return a + b;
	}

	private static double sub(double a, double b) {
		return a - b;
	}

	private static double mult(double a, double b) {
		return a * b;
	}

	private static double div(double a, double b) {
		if (b != 0) {
			return a / b;
		} else {
			println("Error: Division by zero is not allowed.");
			return Double.NaN; // Return NaN (Not a Number) for invalid division
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean runProgram = true;
		double a, b, c;
		int choice;

		do {
			a = getDouble("Enter the first number: ");
			b = getDouble("Enter the second number: ");

			println("Select an operation:");
			println("1.) Addition");
			println("2.) Subtraction");
			println("3.) Multiplication");
			println("4.) Division");
			choice = input.nextInt();

			switch (choice) {
			case 1:
				c = sum(a, b);
				break;
			case 2:
				c = sub(a, b);
				break;
			case 3:
				c = mult(a, b);
				break;
			case 4:
				c = div(a, b);
				break;
			default:
				println("Invalid input");
				continue;
			}

			println(a + " + " + b + " = " + c);

			println("Would you like to perform another operation? (yes/no)");
			input.nextLine(); // Consume newline left by previous nextInt()
			String retry = input.nextLine();

			if (!retry.equalsIgnoreCase("yes")) {
				runProgram = false;
			}

		} while (runProgram);

		println("Thank you for using the calculator!");
		input.close();
	}
}
