package game;
import java.util.Scanner;
import java. util.Random;
public class Game {

	public static void main(String[] args) {
		Scanner Keyboard=new Scanner(System.in);
		System.out.println("Welcome to the Compute 21!");//Welcome user to play this game.
		int totalnum=1;//input total number
		System.out.println(totalnum);//make the computer start first with 1.
		Random r= new Random();//new random
		for (int index=1;index<100;index++) {//start the loop
			int a=1;// Add a value to judge whether the round belong to computer or not.
			System.out.println("Enter the number you want to add: ");//prompt the user
			int add=Keyboard.nextInt();//get add number from user
			if (add>3||add<1) {//judge whether the number added is 1,2,3
				for (int b=0; b<100; b++){//create a loop to break next instead of break the whole loop
					System.out.println("Enter the number you want to add: ");//prompt user to reenter the number
					add=Keyboard.nextInt();//get add number from user again
					if (add>0&&add<4) {//break if the number is not 1,2,3
						break;// break
					}
				}
				
			}
			totalnum+=add;//add up the number added continiously
			
			
			if(totalnum<5&&totalnum>1&&a/2==0) {//Make sure the computer could always get 5
				a+=1;
				totalnum=totalnum+(5-totalnum);
				System.out.println(totalnum);
			}
				
			if (totalnum==5&&a/2==0) {//If user get 5, randomly add number from 1,2,3
				a+=1;
				int ran1=r.nextInt(3-1+1)+1;
		    	totalnum=totalnum+ran1;
		    	System.out.println(totalnum);
			}
			
			
			
			if(totalnum<9&&totalnum>5&&a/2==0) {//Make sure the computer could always get 9
				a+=1;
				totalnum=totalnum+(9-totalnum);
				System.out.println(totalnum);
			}
			
			if (totalnum==9&&a/2==0) {//If user get 9, randomly add number from 1,2,3
				a+=1;
				int ran1=r.nextInt(3-1+1)+1;
		    	totalnum=totalnum+ran1;
		    	System.out.println(totalnum);
			}
			

		    
		    if (totalnum<13&&totalnum>9&&a/2==0) {//Make sure the computer could always get 13
				a+=1;
				totalnum=totalnum+(13-totalnum);
				System.out.println(totalnum);
			}
		    
		    if (totalnum==13&&a/2==0) {//If user get 13, randomly add number from 1,2,3
		    	a+=1;
		    	int ran1=r.nextInt(3-1+1)+1;
		    	totalnum=totalnum+ran1;
		    	System.out.println(totalnum);
		    }
		    
		    
            if (totalnum<17&&totalnum>13&&a/2==0) {//Make sure the computer could always get 17
            	a+=1;
            	totalnum=totalnum+(17-totalnum);
            	System.out.println(totalnum);
            }
			
            if (totalnum==17&&a/2==0) {//If user get 17, randomly add number from 1,2,3
		    	a+=1;
		    	int ran1=r.nextInt(3-1+1)+1;
		    	totalnum=totalnum+ran1;
		    }
            
			if (totalnum<21&&totalnum>17&&a/2==0) {//make sure the computer could always get 21 .
				a+=1;
				totalnum=totalnum+(21-totalnum);
				System.out.println(totalnum);
			}
			
			
			if (totalnum>=21&&a/2!=0) {
				System.out.println("You lost!");//User lost if computer gets 21.
				break;//Break the loop
				}
			
			if (totalnum>=21&&a/2==0) {
				System.out.println("You win!");//Computer lost if the user gets 21.
				break;//break the loop
				}

		   }
	}
}
