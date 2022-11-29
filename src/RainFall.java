/**
Name: Nyi Htet
Course: CS125-01
Lab#: Lab Two
Lab due date: 10/6/2022
Submission Date: 9/27/2022
Description: RainFall operation class
*/
import java.util.Scanner;  //import the Scanner class
public class RainFall{	   //Operation class
	    private double[] rain;	//array rain
	    private double sum;     //sum
	    private double avg;     //average
	    private double greatestRainFall;  //greatest rainfall
	    private double leastRainFall;     //least rainfall
	    RainFall(int months){   //constructor with one parameter
	    	rain = new double[months]; //assign number of months in array rain's size declarator
	    }	//end of constructor
	    public void getValues() {	//method to get monthly rainfall
	    	for(int i=0;i<rain.length;i++) {	//for-loop
	    		Scanner key = new Scanner(System.in);	//create a Scanner object
	    		System.out.print("month "+(i+1)+"\'s rainfall: ");	//ask each month's rainfall
	    		rain[i] = key.nextDouble();		//assign each month's rainfall
	    	}  // end of for-loop
	    } //end of method
	    public void sum() {			//method to calculate sum of rainfall
	    	for(int i=0;i<rain.length;i++) {	//for-loop
	    		sum += rain[i];     //getting sum using accumulator variable
	    	}    //end of for-loop
	    } //end of method
	    public void average() {     //method to calculate average rainfall
	    	avg = sum / rain.length; //divide sum of rainfall by number of months
	    }	//end of method
	    public void greatestRainFall() {   //method to calculate greatest rainfall
	    	greatestRainFall = rain[0];    //assign first array value into the variable
	    	for(int i=1;i<rain.length;i++) {  //for-loop
	    		if(rain[i]>greatestRainFall) {  //checking if next array's value is greater than the previous
	    			greatestRainFall = rain[i]; //update greatest rainfall
	    		}   //end of if statement
	    	}  //end of for-loop
	    }   //end of method 
	    public void leastRainFall() {   //method to calculate least rainfall
	    	leastRainFall = rain[0];    //assign first array value into the variable
	    	for(int i=1;i<rain.length;i++) { //for-loop
	    		if(rain[i]<leastRainFall) {  //checking if next array's value is less than the previous
	    			leastRainFall = rain[i]; //update least rainfall
	    		}  //end of if statement
	    	}  //end of for-loop
	    }   //end of method 
	    public String toString() {   // toString() method 
	    	String str = "\nsum \t\t\t: "+sum+   //display sum of rainfall
	    			     "\naverage \t\t: "+avg+ //display average rainfall
	    			     "\ngreatest rainfall \t: "+greatestRainFall+ //display greatest rainfall
	    			     "\nleast rainfall \t\t: "+leastRainFall;     //display least rainfall
	    	return str; //return the String
	    }
	    
}