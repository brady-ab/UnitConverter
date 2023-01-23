package distance;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Convert From: ");
		String fromValue = input.nextLine();
		
		System.out.print("To: ");
		String toValue = input.nextLine();
		
		
		Converter from = new Converter(fromValue);
		Converter to = new Converter(toValue);
		
		if (from.conversion == 0 || to.conversion == 0) {
			System.out.println("Invalid Unit type. Valid units are 'centimeter, meter, inch, foot, yard");
			return;
		}
		
		System.out.print("Value: ");
		var value = input.nextLine();
			
		try {
			Double.valueOf(value);
			}
			catch(Exception ex) {
				System.out.println("Please enter a number for the value type.");
				return;
			}
		
		double cm = from.toCentimeters(Double.parseDouble(value));
		double convertedValue = to.fromCentimeters(cm);
		
		System.out.println (value + " " + fromValue + "(s) = " + convertedValue + " " + toValue + "(s)");
	}
	
}
