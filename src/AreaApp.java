
//Code a test program AreaApp by creating at least two different hard-coded data for each object for testing ??
/**
Name: Nyi Htet
Course: CS125-01
Lab#: Lab Two
Lab due date: 10/6/2022
Submission Date: 9/27/2022
Description: The driver code to calculate the areas of circles, rectangles, and cylinders
using overloaded constructors of Area class
*/
public class AreaApp {	//Driver class
	public static void main(String[] args) {	//main method
		Area circle1;   //declare circle1 as a Area variable    
		Area circle2;   //declare circle2 as a Area variable    
		
		Area rectangle1;   //declare rectangle1 as a Area variable    
		Area rectangle2;   //declare rectangle2 as a Area variable    
		
		Area cylinder1;   //declare cylinder1 as a Area variable    
		Area cylinder2;   //declare cylinder2 as a Area variable    
		
		circle1 = new Area(23.0); //assign hard coded radius to cycle object 1
	    circle2 = new Area(32.0); //assign hard coded radius to cycle object 2
	    System.out.println("Circle 1");  //circle 1
		System.out.println(circle1.circleDisplay()); //display the fields 
		System.out.printf("area of cycle\t: %,.2f\n",circle1.getArea()); //display computing result
		System.out.println("\nCircle 2");  //circle 2
		System.out.println(circle2.circleDisplay()); //display the fields
		System.out.printf("area of cycle\t: %,.2f\n",circle2.getArea()); //display computing result
        
		rectangle1 = new Area(12,23); //assign hard coded width and length to rectangle object 1
		rectangle2 = new Area(24,12); //assign hard coded width and length to rectangle object 2
		System.out.println("\nRectangle 1"); //rectangle 1
		System.out.println(rectangle1.rectangleDisplay()); //display the fields 
		System.out.printf("area of rectangle\t: %,.2f\n",rectangle1.getArea()); //display computing result
		System.out.println("\nRectangle 2"); //rectangle 2
		System.out.println(rectangle2.rectangleDisplay()); //display the fields
		System.out.printf("area of rectangle\t: %,.2f\n",rectangle2.getArea()); //display computing result
		
		cylinder1 = new Area(23.0,12.0); //assign hard coded radius and height to cylinder object 1
		cylinder2 = new Area(22.0,33.0); //assign hard coded radius and height to cylinder object 2
		System.out.println("\nCylinder 1"); //cylinder 1
		System.out.println(cylinder1.cylinderDisplay()); //display the fields 
		System.out.printf("area of cylinder\t: %,.2f\n",cylinder1.getArea()); //display computing result
		System.out.println("\nCylinder 2"); //cylinder 2
		System.out.println(cylinder2.cylinderDisplay()); //display the fields
		System.out.printf("area of cylinder\t: %,.2f",cylinder2.getArea()); //display computing result
		}  //end of switch case
	   } //end of the driver class


