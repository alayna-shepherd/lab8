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
	System.out.println("Student " + (students[student - 1]);
		System.out.println("what else would you like to know? (hometown/food): ");
	String field = "";
	field = scan.nextLine();
		
//	try{
//
//		if(field.equals("hometown"))
//		System.out.println(hometown[student - 1]
//				);
//	else if(field.equals("food")){
//	System.out.println(food[student - 1]);
//	}else{
//		throw new IllegalArgumentException("No such field");
//	}
//		 } catch(IllegalArgumentException x){
//	while(true){
//	System.out.println("No such field. Please select hometown or food");
//	field = scan.nextLine();
//	if(field.equals("hometown")){
//	 System.out.println(hometown[student - 1]);
//		break;
//		}else if(field.equals("food")){
//		System.out.println(food[student - 1]);
//	break;
//	}
//	 }
//}
//
//System.out.println("would you like another students info?(Y / N): ");
//		String cont = scan.nextLine();
//		if (cont.equalsIgnoreCase("N"));
//		                break;
//		       }
		
		
		
		


//		
//	}
//	return sum;
//}
}
}

}