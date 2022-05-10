import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name?: ");
		// scanner reads input and stores it. nextLine() makes a new line
		String name = scanner.nextLine();
		System.out.println("How old are you? ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("What is your favorite food? ");
		String food = scanner.nextLine();
		
		System.out.println("Hello " +name);
		System.out.println("You are "+age+" years old");
		System.out.println("Your're favorite food is "+food);
		

		
		
		
	}

}
