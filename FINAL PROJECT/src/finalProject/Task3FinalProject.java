package finalProject;

public class Task3FinalProject {

	public static void main(String[] args) {
		// Jayden's Solution   
		
			int array[]= {1,2,3,4,5,6,7,8,9,10,11,12};
			for(int row=0;row<array.length;row++) {
				System.out.print(array[row]+" ");
        }
			System.out.println();

			for(int row=array.length-1;row>=0;row--) {
				System.out.print(array[row]+" ");
			}
			
System.out.println("\n");
		
		// Isabella's Solution
		int [] vector = {7, 6, 2, 8, 3, 9, 20, 14, 16, 11}; // Declare a vector with disorganized values
		int temp = 0; // Set a temporal value to store values while organizing the vector
		
		for (int i = 0; i < vector.length; i++) { // Go through the array
			for (int j = 1; j < (vector.length - i); j++){ 
				//Organize the array from least to greatest
				if (vector[j-1] > vector[j]) {
					temp = vector[j-1];
					vector[j-1] = vector[j];
					vector[j] = temp;
				}
			}
		}
		// Print the organized array
		for (int x = 0; x < vector.length; x++) {
			System.out.print(vector[x]+ " "); 
		}
			System.out.println();
		
		//Print the array from greatest to least
			for(int x= vector.length-1; x>=0; x--) {

	              System.out.print(vector[x]+" ");
			}
		}
	} 
  

