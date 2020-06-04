package finalProject;

public class FinalProject {

	public static void main(String[] args) {
		public static void main(String[] args) {
	// Project 2 
		double Mexico, US; 
		double rateM, rateUS; 
		int year; 
		
		//Declare all the variables
			year = 0;
			rateM = 0.0101; 
			rateUS = 0.0015; 
			Mexico = 121000000; 
			US = 315000000; 
			
			while (US >= Mexico) {
				year+=1;
				
			System.out.println("Year " + year);
			System.out.println("The population of Mexico is: " + Mexico);
			System.out.println("The population of the United States is: " + US + "\n");
			
			Mexico = Mexico + (Mexico * rateM); 
			US = US - (US * rateUS); 
						
		}
			System.out.println("It took " + year + " years for the population of Mexico to exceed the population of United States");
	}
	}

