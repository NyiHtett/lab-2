/**
Name: Nyi Htet
Course: CS125-01
Lab#: Lab Two
Lab due date: 10/6/2022
Submission Date: 9/27/2022
Description: Area operation class
*/
public class Area {		//Operation class
	private double radius; //radius
	private int width;	   //width
	private int length;    //length
	private double height; //height
	private double area;   //area
	Area(double rad){    //overloaded constructor for circle
		radius = rad;    //assign radius of circle
		circleArea();     //call method to calculate area of cycle
	}
	Area(int wid, int len){   //overloaded constructor for rectangle
		width = wid;     //assign width
		length = len;    //assign length
		rectangleArea(); //call method to calculate area of rectangle
	}
	Area(double rad, double h){   //overloaded constructor for cylinder
		radius = rad;   //assign radius
		height = h;     //assign height 
		cylinderArea(); //call method to calculate area of cylinder
	}
	public void circleArea() {	//method to calculate area of cycle
		area = Math.PI*radius*radius; //store circle's area
	} //end of method
	public void rectangleArea() {	//method to calculate area of rectangle
		area = width*length;  //store rectangle's area
	} //end of method
	public void cylinderArea() {	//method to calculate area of cylinder
		area = (2*Math.PI*radius*height) + (2*Math.PI*radius*radius);  //store cylinder's area
	} //end of method
	public String circleDisplay() {  //display method for cycle
		return "radius of cycle\t: "+radius;    //display radius field
	} //end of method 
	public String rectangleDisplay() {  //display method for rectangle
		String str = "width of rectangle\t: " + width+  //display width field
				     "\nlength of rectangle\t: " + length;  //display length field
		return str;  //return string
	} //end of method 
	public String cylinderDisplay() {  //display method for cylinder
		String str = "radius of cylinder\t: " + radius+  //display radius field
				     "\nheight of cylinder\t: " + height;    //display height field
		return str;  //return string
	} //end of method 
	public double getArea() {
		return area;
	}
} //end of the operation class
