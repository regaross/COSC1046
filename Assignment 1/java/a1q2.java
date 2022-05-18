public class Question2 {
	public static void main (String [] args)
	
	{
		double CAD = 345.00;
		double conEURO = 0.66;
		double conUSD = 0.77;
		double conJPY = 86.04;
		double conCNY = 5.27;
		double conINR = 55.72;
	// Conversion rates taken from online September 17th/2018 at 10:30 AM
		
		System.out.printf("$ %5.2f\n", CAD);
		System.out.println ("CAD Buys:");
		
			double Euro = CAD * conEURO;
		
		System.out.printf("\tEUR: %5.2f\n", Euro);
		
			double Usd = CAD * conUSD;
		
		System.out.printf("\tUSD: %5.2f\n", Usd);
		
			double Jpy = CAD * conJPY;
		
		System.out.printf("\tJPY: %7.2f\n", Jpy);
		
			double Cny = CAD * conCNY;
		
		System.out.printf("\tCNY: %6.2f\n", Cny);
		
			double Inr = CAD * conINR;
			
		System.out.printf("\tINR: %7.2f\n", Inr);
		// YaY I gOt thE DecIMalS to WoRk!!!!
	}
	
}
		
		
		
		
		
		
		
