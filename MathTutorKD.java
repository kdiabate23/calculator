package com.itse.kareemdiabate;

import java.util.Scanner;

public class MathTutorKD {
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		String input; // To hold input
		char repeat; // To hold 'y' or 'n'
		
		System.out.println("This program allows the user to perform an operation on two number");
		
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		// Get as many sets of calculations as the user wants
		do
		{
			System.out.println("\nMain Menu");
			System.out.println("\n1: Addition\n2: Subtraction\n3: Multiplication"
					+ "\n4: Division\n5: Exit");
			System.out.print("\nEnter a choice: "); //Prompt the user to enter a choice from the menu
			int choice = in.nextInt();   //variable to hold user choice
			
			int number1 = (int)(Math.random() * 10);  // generates random number
			int number2 = (int)(Math.random() * 10);  // generates random number
			
			if((choice == 1))
			{
				System.out.print("What is "+ number1 + " + " + number2 + "?");
				int answer = in.nextInt();
				if(answer == number1 + number2)   // Check if user entered the right answer
				{
					System.out.println("Correct");  // Display this message if user got the answer right
				}else
				{
					System.out.println("Your answer is wrong. The correct answer is "+ (number1 + number2)); // display this
                    //message if he/she gets it wrong
				}
			}else if (choice == 2)   // user chose subtraction
			{
				int temp = number1;
				if(number1 < number2)  // check if number 1 is less than number 2
				{
					number1 = number2;  // replace number 1 by number 2
					System.out.print("What is "+ number1 + " - " + temp + "?"); //Display this message
					
					int answer = in.nextInt(); // hold answer
					if(answer == (number1 - temp))
					{
						System.out.println("Correct");
					}else
					{
						System.out.println("Your answer is wrong. The correct answer is "+(number1 - temp));
					}
				}else  // IF number 1 is greater or equal number 2
				{
                    System.out.print("What is "+ number1 + " - " + number2 + "?");
					
					int answer = in.nextInt();
					if(answer == (number1 - number2))
					{
						System.out.println("Correct");
					}else
					{
						System.out.println("Your answer is wrong. The correct answer is "+ (number1 - number2));
					}
				}
			}else if(choice == 3) // User chose multiplication
			{
				System.out.print("What is "+ number1 + " x " + number2 + "?");
				int answer = in.nextInt();
				if(answer == number1 * number2)
				{
					System.out.println("Correct");
				}else
				{
					System.out.println("Your answer is wrong. The correct answer is "+ (number1 * number2));
				}
			}else if(choice == 4)
			{
				if(number2 != 0) // check if number 2 is not zero
				{
                   System.out.print("What is "+ number1 + " / " + number2 + "?");
					
					int answer = in.nextInt();
					if(answer == number1 / number2)
					{
						System.out.println("Correct");
					}else
					{
						System.out.println("Your answer is wrong. The correct answer is "+(number1 / number2));
						
					}
				}else
				{
					System.out.println("You cannot divide " + number1 + " by " + number2); // Display this message if number 2 is 0
				}
			}else
			{
                System.out.println("Exit");  // User chose to exit
				
				return; // end the program
			}
			
			
			
			System.out.print("\nDo You want to perform another calculation?Enter Y for yes or N for no: ");
			input = keyboard.nextLine(); // Read a line.
			repeat = input.charAt(0); // Get the first char.
			
		}while(repeat == 'Y' || repeat == 'y');
		
	}

}
