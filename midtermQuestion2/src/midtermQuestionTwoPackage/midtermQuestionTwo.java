package midtermQuestionTwoPackage;

import java.util.Scanner; // Imports Scanner in order to read user inputs.

// Sets Class
class midtermQuestionTwo {
	public static void main(String[] args) { // Sets main class's visibility, return type, and method signature.
		Scanner scan = new Scanner(System.in); // Opens scanner.
		
		System.out.print("How many numbers will you input into your array? : "); // Prints prompt.
		int numOfList = Integer.parseInt(scan.nextLine()); // Reads user input.
		
		String arrayOfNumbers[] = new String[numOfList]; // Length of array is determined by user input.
		
		// "for" statement prompts user to enter a new number an amount of times equal to the length of the array.
		for (int i = 0; i < arrayOfNumbers.length; i++) {
			System.out.print("Enter number : ");
			arrayOfNumbers[i] = scan.nextLine();
		}
		
		smallestFinder(arrayOfNumbers);
		largestFinder(arrayOfNumbers);
			
		scan.close(); // Closes scanner.

	}
	
	// Method finds smallest number.
	public static void smallestFinder(String[] arrayOfNumbers) {
			String[] numbers = arrayOfNumbers;
			
			//assign first element of an array to smallest
			int smallest = Integer.parseInt(numbers[0]);
			
			for(int i=1; i< numbers.length; i++)
			{
				if (Integer.parseInt(numbers[i]) < smallest)
					smallest = Integer.parseInt(numbers[i]);
				
			}
				
			System.out.println("Smallest Number is : " + smallest);
		}
	
	// Method finds largest number.
	public static void largestFinder(String[] arrayOfNumbers) {
			String[] numbers = arrayOfNumbers;
			
			//assign first element of an array to largest
			int largest = Integer.parseInt(numbers[0]);
			
			for(int i=1; i< numbers.length; i++)
			{
				if(Integer.parseInt(numbers[i]) > largest)
					largest = Integer.parseInt(numbers[i]);
			}
				
			System.out.println("Largest Number is : " + largest);
		
	}
	
	
}