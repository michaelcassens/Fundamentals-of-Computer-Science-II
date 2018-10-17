/*
 * Michael Cassens
 * Date: 10.15.18
 * Purpose: To generate new cars and drive them
 */

import java.util.Scanner;

public class Driver
{

	public static void main(String[] args)
	{
		// get user input
		Scanner myScan = new Scanner(System.in);
		
		System.out.print("What is the manufacturer? ");
		
		String manufacturer = myScan.nextLine();
		
		System.out.print("What is the model? ");
		
		String model = myScan.nextLine();
		
		// instantiate new car with actual parameters
		Car myCar = new Car(manufacturer, model);
		
		
		System.out.print("To where do you want to drive? ");
		
		String destination = myScan.nextLine();
		
		System.out.println(myCar.drive(destination));
		
		System.out.println(myCar);

	}

}
