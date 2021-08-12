package main;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Converter {
	/*
	 * Handles the InputMismatchException exception 
	 * that the Scanner object comes across
	 */
	public static double scanCheck(Scanner sc) {
		try {
			return sc.nextDouble();
		}
		
		catch (InputMismatchException mis) {
			System.out.println("Invalid input. Please try again.");
			return -1;
		}
	}
	
	//main method
	public static void main(String args[]) {
		int firstMenuSelection = 0;
		Scanner scan = new Scanner(System.in);
		while (firstMenuSelection != 7) {
			//asks user to choose a conversion option
			double quantity = 0.0;
			Menus.printFirstMenu();
			
			//takes option via Scanner object
			firstMenuSelection = (int) scanCheck(scan);
			
			//switch statement used to handle initial menu
			switch(firstMenuSelection) {
				case 1:
					//prints one of several secondary menus
					Menus.printVolumeMenu();
					//reads input for secondary menu
					int volumeMenuSelection = (int) scanCheck(scan);
					//asks for quantity if option is valid
					if (volumeMenuSelection != 7) {
						Menus.askQuantity();
						quantity = scanCheck(scan);
					}
					//if option is invalid, we go back to the menu and ask again
					else if (volumeMenuSelection == -1) {
						Menus.printVolumeMenu();
						volumeMenuSelection = (int) scanCheck(scan);
					}
					
					/*
					 * if quantity is invalid, then we will just shut 
					 * down the program entirely. The initial idea was that
					 * if the quantity is invalid, then the user would be
					 * stuck on that phase until they inputted a valid
					 * quantity, afterwards, I thought of taking them back to
					 * the initial menu, but trying to do this just resulted in enough 
					 * infinite loop runs to the point where my patience 
					 * was wearing thin. This is optional anyway. 
					 */
					if (quantity == -1) {
						System.out.println("Invalid output. Shutting Down...");
						System.exit(-1);
					}
					/*
					 * then the calculations are set in place with the option
					 * and quantity set in place
					 */
					Menus.handleVolumeMenu(volumeMenuSelection, quantity);
					break;
					
				case 2:
					Menus.printDistanceMenu();
					int distanceMenuSelection = (int) scanCheck(scan);
					if (distanceMenuSelection != 7) {
						Menus.askQuantity();
						quantity = scanCheck(scan);
					}
					else if (distanceMenuSelection == -1) {
						Menus.printDistanceMenu();
						distanceMenuSelection = (int) scanCheck(scan);
					}
					
					if (quantity == -1) {
						System.out.println("Invalid output. Shutting Down...");
						System.exit(-1);
					}
					
					Menus.handleDistanceMenu(distanceMenuSelection, quantity);
					break;
					
				case 3:
					Menus.printSpeedMenu();
					int speedMenuSelection = (int) scanCheck(scan);
					if (speedMenuSelection != 3) {
						Menus.askQuantity();
						quantity = scanCheck(scan);
					}
					else if (speedMenuSelection == -1) {
						Menus.printSpeedMenu();
						speedMenuSelection = (int) scanCheck(scan);
					}
					
					if (quantity == -1) {
						System.out.println("Invalid output. Shutting Down...");
						System.exit(-1);
					}
					
					Menus.handleSpeedMenu(speedMenuSelection, quantity);
					break;
					
				case 4:
					Menus.printCookingMenu();
					int cookingMenuSelection = (int) scanCheck(scan);
					if (cookingMenuSelection != 7) {
						Menus.askQuantity();
						quantity = scanCheck(scan);
					}
					else if (cookingMenuSelection == -1) {
						Menus.printCookingMenu();
						cookingMenuSelection = (int) scanCheck(scan);
					}
					
					if (quantity == -1) {
						System.out.println("Invalid output. Shutting Down...");
						System.exit(-1);
					}
					
					Menus.handleCookingMenu(cookingMenuSelection, quantity);
					break;
					
				case 5:
					Menus.printTempMenu();
					int tempMenuSelection = (int) scanCheck(scan);
					if (tempMenuSelection != 7) {
						Menus.askQuantity();
						quantity = scanCheck(scan);
					}
					else if (tempMenuSelection == -1) {
						Menus.printTempMenu();
						tempMenuSelection = (int) scanCheck(scan);
					}
					
					if (quantity == -1) {
						System.out.println("Invalid output. Shutting Down...");
						System.exit(-1);
					}
					
					Menus.handleTempMenu(tempMenuSelection, quantity);
					break;
					
				case 6:
					Menus.printCurrencyMenu();
					int currencyMenuSelection = (int) scanCheck(scan);
					if (currencyMenuSelection != 7) {
						Menus.askQuantity();
						quantity = scanCheck(scan);
					}
					else if (currencyMenuSelection == -1) {
						Menus.printCurrencyMenu();
						currencyMenuSelection = (int) scanCheck(scan);
					}
					if (quantity == -1) {
						System.out.println("Invalid output. Shutting Down...");
						System.exit(-1);
					}
					Menus.handleCurrencyMenu(currencyMenuSelection, quantity);
					break;
					
				/*
				 * immediately breaks from the switch statement, and should
				 * go back to the while loop, then exit
				 */
				case 7:
					break;
				/*
				 * covers any input that doesn't trigger an exception, but
				 * is incorrect (out of range)
				 */
				default:
					System.out.println("Option not found. Please try again.");
					break;
			}
			
			if (firstMenuSelection == -1) {
				continue;
			}
			
		}
		
		//End cue for the main method
		System.out.println("Have a nice day!");
		scan.close();
	}
}
