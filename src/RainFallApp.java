/**
Name: Nyi Htet
Course: CS125-01
Lab#: Lab Two
Lab due date: 10/6/2022
Submission Date: 9/27/2022
Description: The driver code to run RainFall, create its object, 
call its methods to accept monthly rainfall using loop and array, assign and calculate the sum, 
average, greatest and least rainfall.
*/
import java.util.Scanner;	//import the Scanner class
public class RainFallApp {  //Driver class
	public static void main(String[] args) {	//main method
		Scanner key = new Scanner(System.in);	//create a Scanner object
		int answer;		//declare variable answer
		final int ONE_YEAR = 12;	//assign months in a year to a constant variable
		do {            //do-while loop 
			RainFall rain = new RainFall(ONE_YEAR);   //create RainFall object
			rain.getValues();  //call method to assign the monthly rainfall
			rain.sum();        //call method to calculate sum of rainfall in a year
			rain.average();    //call method to calculate average rainfall over a year
			rain.greatestRainFall();  //call method to find greatest rainfall
			rain.leastRainFall();     //call method to find least rainfall
			System.out.println(rain); //output all results by calling object
		    System.out.println("\nDo you want to calculate for next round of yearly rainfall?"
		    		+ "\n( enter -99 to stop )"); //asking another round 
			answer = key.nextInt();   //assign user's answer
		} while(answer != -99);   //end of do-while loop, checking user's input is not -99
	}	//end of main()
}   //end of the driver class
