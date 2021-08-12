package main;
/*
 * This whole class is just meant to store the secondary menu text
 * as well as functions that handle the options in the secondary menus
 * to reduce clutter in main.
 */
public class Menus {
	public static void askQuantity() {
		System.out.print("Please enter a quantity: ");
	}
	
	//initial menu that user sees
	public static void printFirstMenu() {
		System.out.println("Please select an conversion:"
				+ "\n 1. Volume"
				+ "\n 2. Distance"
				+ "\n 3. Speed"
				+ "\n 4. Cooking"
				+ "\n 5. Temperature"
				+ "\n 6. Currency"
				+ "\n 7. Quit");
	}
	
	//option 1 menu
	public static void printVolumeMenu() {
		System.out.println("Please select an option:"
				+ "\n 1. Cubic Feet to Cubic Meters"
				+ "\n 2. Cubic Feet to Cubic Miles"
				+ "\n 3. Cubic Meters to Cubic Feet"
				+ "\n 4. Cubic Meters to Cubic Miles"
				+ "\n 5. Cubic Miles to Cubic Feet"
				+ "\n 6. Cubic Miles to Cubic Meters"
				+ "\n 7. Back.");
	}
	
	//method that handles option 1
	public static void handleVolumeMenu(int selection, double quantity) {
		double result;
		switch(selection) {
			case 1:
				result = Formulas.cubeFtTocubeM(quantity);
				System.out.println(result + " cubic meters.");
				break;
			case 2:
				result = Formulas.cubeFtTocubeMiles(quantity);
				System.out.println(result + " cubic miles.");
				break;
			case 3:
				result = Formulas.cubeMTocubeFt(quantity);
				System.out.println(result + " cubic feet.");
				break;
			case 4:
				result = Formulas.cubeMTocubeMiles(quantity);
				System.out.println(result + " cubic miles.");
				break;
			case 5:
				result = Formulas.cubeMilesTocubeFt(quantity);
				System.out.println(result + " cubic feet.");
				break;
			case 6:
				result = Formulas.cubeMilesTocubeM(quantity);
				System.out.println(result + " cubic meters.");
				break;
			case 7:
				break;
		}
	}
	
	//option 2
	public static void printDistanceMenu() {
		System.out.println("Please select an option:"
				+ "\n 1. Feet to Kilometers"
				+ "\n 2. Feet to Miles"
				+ "\n 3. Kilometers to Feet"
				+ "\n 4. Kilometers to Miles"
				+ "\n 5. Miles to Feet"
				+ "\n 6. Miles to Kilometers"
				+ "\n 7. Back");
	}
	
	//method that handles option 2
	public static void handleDistanceMenu(int selection, double quantity) {
		double result;
		switch(selection) {
			case 1:
				result = Formulas.ftToKm(quantity);
				System.out.println(result + " kilometers.");
				break;
			case 2:
				result = Formulas.ftToMiles(quantity);
				System.out.println(result + " miles.");
				break;
			case 3:
				result = Formulas.kmToFt(quantity);
				System.out.println(result + " feet.");
				break;
			case 4:
				result = Formulas.kmToMiles(quantity);
				System.out.println(result + " miles.");
				break;
			case 5:
				result = Formulas.milesToFt(quantity);
				System.out.println(result + " feet.");
				break;
			case 6:
				result = Formulas.milesToKm(quantity);
				System.out.println(result + " kilometers.");
				break;
			case 7:
				break;
		}
	}
	
	//option 3
	public static void printSpeedMenu() {
		System.out.println("Please select an option:"
				+ "\n 1. Miles per Second (mph) to Machs"
				+ "\n 2. Machs to Miles per Second (mph)"
				+ "\n 3. Back");
		
	}
	
	//method that handles option 3
	public static void handleSpeedMenu(int selection, double quantity) {
		double result;
		switch(selection) {
			case 1:
				result = Formulas.mpsToMach(quantity);
				System.out.println(result + " machs.");
				break;
			case 2:
				result = Formulas.machToMps(quantity);
				System.out.println(result + " mph.");
				break;
			case 3:
				break;
		}
	}
	
	//option 4
	public static void printCookingMenu() {
		System.out.println("Please select an option:"
				+ "\n 1. Cups to Teaspoons"
				+ "\n 2. Cups to Tablespoons"
				+ "\n 3. Tablespoons to Cups"
				+ "\n 4. Tablespoons to Teaspoons"
				+ "\n 5. Teaspoons to Cups"
				+ "\n 6. Teaspoons to Tablespoons"
				+ "\n 7. Back");
	}
	
	//method that handles option 4
	public static void handleCookingMenu(int selection, double quantity) {
		double result;
		switch(selection) {
			case 1:
				result = Formulas.cupsToTeaspoons(quantity);
				System.out.println(result + " teaspoons.");
				break;
			case 2:
				result = Formulas.cupsToTablespoons(quantity);
				System.out.println(result + " tablespoons.");
				break;
			case 3:
				result = Formulas.tablespoonsToCups(quantity);
				System.out.println(result + " cups.");
				break;
			case 4:
				result = Formulas.tablespoonsToTeaspoons(quantity);
				System.out.println(result + " teaspoons.");
				break;
			case 5:
				result = Formulas.teaspoonsToCups(quantity);
				System.out.println(result + " cups.");
				break;
			case 6:
				result = Formulas.teaspoonsToTablespoons(quantity);
				System.out.println(result + " tablespoons.");
				break;
			case 7:
				break;
		}
	}
	
	//option 5
	public static void printTempMenu() {
		System.out.println("Please select an option:"
				+ "\n 1. Farenheit to Celsius"
				+ "\n 2. Farenheit to Kelvin"
				+ "\n 3. Tablespoons to Cups"
				+ "\n 4. Tablespoons to Teaspoons"
				+ "\n 5. Teaspoons to Cups"
				+ "\n 6. Teaspoons to Tablespoons"
				+ "\n 7. Back");
	}
	
	//method that handles option 5
	public static void handleTempMenu(int selection, double quantity) {
		double result;
		switch(selection) {
			case 1:
				result = Formulas.fToC(quantity);
				System.out.println(result + " degrees Celsius.");
				break;
			case 2:
				result = Formulas.fToK(quantity);
				System.out.println(result + " degrees Kelvin.");
				break;
			case 3:
				result = Formulas.cToF(quantity);
				System.out.println(result + " degrees Farenheit.");
				break;
			case 4:
				result = Formulas.cToK(quantity);
				System.out.println(result + " degrees Kelvin.");
				break;
			case 5:
				result = Formulas.kToF(quantity);
				System.out.println(result + " degrees Farenheit.");
				break;
			case 6:
				result = Formulas.kToC(quantity);
				System.out.println(result + " degrees Celsius.");
				break;
			case 7:
				break;
		}
	}
	
	//option 6
	public static void printCurrencyMenu() {
		System.out.println("Please select an option:"
				+ "\n 1. US Dollars to Japanese Yen"
				+ "\n 2. Japanese Yen to US Dollars"
				+ "\n 3. Back");
	}
	
	//method that handles option 6
	public static void handleCurrencyMenu(int selection, double quantity) {
		double result;
		switch(selection) {
			case 1:
				result = Formulas.usdToYen(quantity);
				System.out.println(result + " yen.");
				break;
			case 2:
				result = Formulas.yenToUSD(quantity);
				System.out.println(result + " USD.");
				break;
			case 3:
				break;
		}
	}
}
