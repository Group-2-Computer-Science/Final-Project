package finalProject;

public class FinalProject {

	public static void main(String[] args) {
		//Project 2 
		
	//Declare the necessary variables
	double Mexico, US, year; 
	double rateM, rateUS; 
		
		year = 0;
		rateM = 1.01; 
		rateUS = 0.15; 
		Mexico = 121000000; 
		US = 315000000; 
		
		System.out.println("The population of Mexico on year " + year + " is: " + Mexico);
		System.out.println("The population of the United States on year " + year + " is: " + US);
		
		//Set up the new population
		Mexico = Mexico + (Mexico * rateM); 
		US = US - (US * rateUS); 

	}

}
