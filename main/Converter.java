package main;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Converter {
	/*
	 * Handles the InputMismatchException that the Scanner object
	 * comes across
	 */
	public static int ScanCheck(Scanner sc) {
		try {
			return sc.nextInt();
		}
		
		catch (InputMismatchException mis) {
			System.out.println("Invalid option. Please try again.");
			return -1;
		}
	}
	
	//Conversion Function = Cups to TeaSpoons
	public static double CupsToTeaspoons(int cups) {
		return cups * 48.0;
	}
	
	//Conversion Function = Miles to Kilometers
	public static double MilestoKM(int mile) {
		return mile * 1.60934;
	}
	
	//Conversion Function = US Gallons to Imperial Gallons
	public static double UStoImpGallons(int usGall) {
		return usGall * 0.832674;
	}
	
	public static void main(String args[]) {
		int menuSelection = 0;
		while (true) {
			
			//asks user to choose an option
			Scanner scan = new Scanner(System.in);
				System.out.println("Please select an option:"
						+ "\n 1. Cups to Teaspoons"
						+ "\n 2. Miles to Kilometers"
						+ "\n 3. US Gallons to Imperial Gallons"
						+ "\n 4. Quit\n");
			
			//takes option via Scanner object
			menuSelection = ScanCheck(scan);
			if (menuSelection == -1) {
				continue;
			}
			
			//Break out of the main while loop
			if (menuSelection == 4) {
				break;
			}
			
			//asks for quantity
			System.out.print("Please enter a quantity: ");
			
			//takes quantity via Scanner
			int quantity = ScanCheck(scan);
			if (quantity == -1) {
				continue;
			}
			
			switch (menuSelection) {
				case 1:
					double result = CupsToTeaspoons(quantity);
					System.out.println("\n" + result + " teaspoons.\n");
					break;
				case 2:
					double result2 = MilestoKM(quantity);
					System.out.println("\n" + result2 + " kilometers.\n");
					break;
				case 3:
					double result3 = UStoImpGallons(quantity);
					System.out.println("\n" + result3 + " Imperial Gallons.\n");
					break;
			}
		}
		System.out.println("Have a nice day!");
	}
}
