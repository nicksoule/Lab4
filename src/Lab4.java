import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userNum;
		char answer = 'Y';

		while ((answer == 'Y') || (answer == 'y')) {
			System.out.println("Welcome to the Factorial Calculator!\n");
			System.out.println("Enter an integer that's greater than 0 but less than 10: ");
			userNum = scan.nextInt();
			
			while ((userNum < 1) || (userNum > 10)) {
				System.out.println("Invalid entry. Please enter a number between 1 and 10: ");
				userNum = scan.nextInt();
			}

			long i, fact = 1;

			for (i = 1; i <= userNum; i++) {
				fact = fact * i;
			}

			System.out.println("The factorial of " + userNum + " is " + fact + "\n");
			System.out.println("Continue? (y/n/): ");
			answer = scan.next().charAt(0);

		}
	}

}
