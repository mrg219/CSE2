// Max Grossman
// 10-24-15
// CSE002
// The purpose of this program is to calculate the area of a circle, rectangle, or square using overloaded methods.

// importing the scanner
import java.util.Scanner;
//start of class
public class areas {
    // area method for circle
    public static void area(int x) {
        // calculating the area of the circle
        System.out.println("The area of the circle is: "+(x*x*Math.PI));
    } // end of circle area method
    // area method for rectangle
    public static void area(int x, int y){
        // calculating the area of the rectangle
        System.out.println("The area of the rectangle is: "+(x*y));
    } // end of rectangle area method
    // area method for trapezoid
    public static void area(int x, int y, int z){
        // calculating the area of the trapezoid
        System.out.println("The area of the trapezoid is: "+(((x+y)/2)*z));
    } // end of trapezoid area method
    // start of main method
    public static void main(String[] args){
        // creation of the scanner
        Scanner myScanner = new Scanner(System.in);
        //setting the boolean for the while loop to true
        boolean set = true;
        // beginning of the while loop
        while (set == true) {
        // prompting the user for which shape
        System.out.println("what shape would you like the area of? (0 = end program, 1 = circle, 2 = rectangle, 3 = trapezoid)");
        // user response to which shape
        int shape = myScanner.nextInt();
        // if statement for circle area
        if (shape == 1) {
            // prompting user for circle radius
            System.out.print("Please enter the radius of the circle: ");
            // user's response
            int x = myScanner.nextInt();
            // calling the circle area method
            area(x);
            // telling the user how to end the program
            System.out.println("enter 0 to end the program");
        } // end of if statement
        // else if statement for rectangle area
        else if (shape == 2) {
            // prompting user for rectangle height
            System.out.print("Please enter the height of the rectangle: ");
            // user's response
            int x = myScanner.nextInt();
            // prompting user for rectangle width
            System.out.print("Please enter the width of the rectangle: ");
            // user's response
            int y = myScanner.nextInt();
            // calling rectangle area method
            area(x,y);
            // reminding user how to end the program
            System.out.println("enter 0 to end the program");
           } // end of else if statement for rectangle area
        // else if statement for trapezoid area
        else if (shape == 3) {
            // prompting user for base 1 of the trapezoid
            System.out.print("Please enter base 1 of the trapezoid: ");
            // user's response
            int x = myScanner.nextInt();
            // prompting user for base 2 of the trapezoid
            System.out.print("Please enter base 2 of the trapezoid: ");
            // user's response
            int y = myScanner.nextInt();
            // prompting user for height of the trapezoid
            System.out.print("Please enter the height of the trapezoid: ");
            // user's response
            int z = myScanner.nextInt();
            // calling trapezoid area method
            area(x,y,z);
            // reminding user how to end the program
            System.out.println("enter 0 to end the program");
        } // end of if else statement for trapezoid area
        // else if statement to end the program
        else if (shape == 0) {
            //setting the boolean value to false
            set = false;
        } // end of if else statement to end the program
        // else statement to tell the user they eneter an invalid value
        else {
            // telling the user they enter an invalid value
            System.out.println("Invalid option selected. Please try again.");
        } // end of else statement
        } // end of while loop
        } // end of main method
    } // end of class