package distance;

public class Converter {
	
	private double meterToCentimeter = 100;
	private double yardToCentimeter = 91.44;
	private double footToCentimeter = 30.48;
	private double inchToCentimeter = 2.54;
	private double centimeterToCentimeter = 1;

	public double conversion;
	
	public Converter(String unit) {
		
		
		switch (unit) {
			
		
		case ("inch"):
			
			conversion = inchToCentimeter;
			
			break;
		
		case ("foot"):
			
			conversion = footToCentimeter;

			break;
		
		case ("yard"):
			
			conversion = yardToCentimeter;
			
			break;
		
		case ("meter"):
			
			conversion = meterToCentimeter;
			
			break;
			
		case ("centimeter"):
			
			conversion = centimeterToCentimeter;
			
			break;
			
		default: 
			conversion = 0;
			break;
		
		}
		
	}
	
	public double toCentimeters(double length) {
		
		return (length * conversion);
		
	}
	
	public double fromCentimeters(double length) {
		
		return (length / conversion);
		
	}
}
