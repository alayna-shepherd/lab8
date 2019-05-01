package co.grandcircus;

import java.util.Arrays;
import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		
		//scanner
		String[] students = {"Layna S.", "Julia C.", "Wesley B.", "Jacqui K.", "Libby T.", "Carson D."};
		String[] hometown = {"Warren", "Detroit", "Farmington Hills", "Hazel Park", "Royal Oak", "Bloomfield Hills"};
		String[] food = {"cheese enchiladas", "avocado toast", "spahetti", "Telway sliders", "cheese sticks","steak",};
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Welcome to our Java class! Which student would like to learn more about? (enter a number 1-6): ");
		int student = scan.nextInt();
		scan.nextLine();
		
		try {
			System.out.println(students[student -1 ]);
		} catch (IndexOutOfBoundsException e) {
			while(true) {
				System.out.println("That student doesnt exist. please try again. (enter a number 1-6)");
				student = scan.nextInt();
				scan.hasNextLine();
				if (student >= 1 && student <= 6)
					break;
			}
		System.out.println(students[student - 1]);
		System.out.println("what else would you like to know? (hometown / food): ");

		        }
		    }
		
		
		
		

//		
//		//get user input for student number and show error if invalid 
//		System.out.println("Welcome to our Java class! Which student would like to learn more about? (enter a number 1-6): ");
//		int student = scan.nextInt();
//		//int x = scan.nextInt();
//		if (student > 6 ){
//		System.out.println("That student doesnt exist. please try again. (enter a number 1-6)");
//	
//		scan.close();
//		System.out.print(("Student ") + (student) + "is "  + (students(student)) + ".") ;
//		System.out.println("What would you like to know about" + (students(student)) +"?");
//		
		
		

		
		
//		//parallel arrays are arrays that typically are the same amount of items
//		//but may be different types
//		//that use the indices to reference things that go together
//		String[]  = {"Nick","Adam","Devosha","Stassi"};
//		int[] jerseyNums = {3, 15, 2, 14};
//		String[] teamName = {"Arsenal", "Chelsea","Cookie Love","Lit"};
//		
//		for (int i = 0; i < players.length; i++) {
//			System.out.println(jerseyNums[i] + " " + players[i] + " " + teamName[i]);
//		}
//		int[] jerseyNums2 = {3, 15, 2, 14, 67, 89, 32};
//		int jerseySum = sumArray(jerseyNums2);
//		System.out.println(jerseySum);
//	}
//
//
//public static int sumArray(int[] arr) {
//	int sum = 0;
//	
//	for(int i = 0; i < arr.length; i++) {
//		sum += arr[i];
//		
//	}
//	return sum;
//}
}
}

	
	}