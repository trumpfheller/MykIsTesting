package methods;

import java.util.Scanner;

public class ftoc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double ftemp, ctemp; 
		
		System.out.println("Enter a temperatur in Fahrenheit: ");
		ftemp = input.nextDouble();
		ctemp = ftoc(ftemp);
		System.out.println(ftemp + " F is equal to " + ctemp + " C."); 
		
		System.out.println("***********Change in temperature*************");
		System.out.println("Enter a temperature in Celsius: ");
		ctemp = input.nextDouble();
		ftemp = ctof(ctemp);
		System.out.println(ctemp + " Celsius is equal to " + ftemp + " F.");
		}

	private static double ftoc(double ftemp) {
			double celsius; 
			celsius = (ftemp - 32.0) * (5.0/9.0);
			return celsius; 
	}

	private static double ctof(double ctemp) {
			double fahrenheit; 
			fahrenheit = ctemp * (9.0/5.0)+ 32.0 ;
			return fahrenheit; 
	}

}
