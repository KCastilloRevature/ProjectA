package main;

/*
 * This whole class is just meant to store conversion functions to
 * reduce clutter in main.
 */
public class Formulas {
	public static double cubeFtTocubeM(double cfeet) {
		return cfeet *  0.02831;
	}
	
	public static double cubeFtTocubeMiles(double cfeet) {
		return cfeet * 0.00000000000679;
	}
	
	public static double cubeMTocubeFt(double cmeter) {
		return cmeter * 35.31467;
	}
	
	public static double cubeMTocubeMiles(double cmeter) {
		return cmeter * 0.000000002399;
	}
	
	public static double cubeMilesTocubeFt(double cmile) {
		return cmile * 147_197_952_000.0;
	}
	
	public static double cubeMilesTocubeM(double cmile) {
		return cmile * 4_168_181_825.4;
	}
	
	public static double ftToKm(double feet) {
		return feet * 0.0003048;
	}
	
	public static double ftToMiles(double feet) {
		return feet * 0.000189394;
	}
	
	public static double kmToFt(double kilometer) {
		return kilometer * 3280.84;
	}
	
	public static double kmToMiles(double kilometer) {
		return kilometer * 0.621371;
	}
	
	public static double milesToFt(double mile) {
		return mile * 5280.0;
	}
	
	public static double milesToKm(double mile) {
		return mile * 1.60934;
	}
	
	public static double mpsToMach(double mps) {
		return mps * 0.00130332;
	}
	
	public static double machToMps(double mach) {
		return mach * 767.269;
	}
	
	public static double milestoKM(double mile) {
		return mile * 1.60934;
	}
	
	public static double cupsToTeaspoons(double cups) {
		return cups * 48.0;
	}
	
	public static double cupsToTablespoons(double cups) {
		return cups * 16.0;
	}
	
	public static double tablespoonsToCups (double tbs) {
		return tbs * 0.0625;
	}
	
	public static double tablespoonsToTeaspoons (double tbs) {
		return tbs * 3.0;
	}
	
	public static double teaspoonsToCups (double teas) {
		return teas * 0.0208333;
	}
	
	public static double teaspoonsToTablespoons (double teas) {
		return teas * 0.333333;
	}
	
	public static double fToC (double faren) {
		return (faren - 32) * (5/9);
	}
	
	public static double fToK (double faren) {
		return (faren - 32) * (5/9) + 273.15;
	}
	
	public static double cToF (double cel) {
		return (cel * (9/5)) + 32;
	}
	
	public static double cToK (double cel) {
		return cel + 273.15;
	}
	
	public static double kToF (double kelv) {
		return (kelv - 273.15) * (9/5) + 32;
	}
	
	public static double kToC (double kelv) {
		return kelv - 273.15;
	}
	
	public static double usdToYen (double usd) {
		return usd * 110.42;
	}
	
	public static double yenToUSD (double yen) {
		return yen * 0.0091;
	}
}
