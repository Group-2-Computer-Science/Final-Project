package finalProject;

public class FinalProject {

	public static void main(String[] args) {
		double Mexico, US, year; 
		double rateM, rateUS; 
			
			year = 1;
			rateM = 1.01; 
			rateUS = 0.15; 
			Mexico = 121000000; 
			US = 315000000; 
			
			System.out.println("The population of Mexico on year " + year + " is: " + Mexico);
			System.out.println("The population of the United States on year " + year + " is: " + US);
			
			Mexico = Mexico + (Mexico * rateM); 
			US = US - (US * rateUS); 
			
			while (US>Mexico) {
				year+=1;
				Mexico = Mexico + (Mexico * rateM); 
				US = US - (US * rateUS);
				if (Mexico>US) {
					System.out.println("It took " + year + " years for the population of Mexico to exceed the population of United States");
					
				}
				
				}
		

	}

}
