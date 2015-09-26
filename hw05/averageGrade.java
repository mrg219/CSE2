//Max Grossman
//CSE 002
//hw05
//26/09/15

// this program is designed to find the average of a student's grades. The user enters 999 to find the average of the grades entered
//the number of grades entered is determined by the student, and a grade greater than 100 or less than 0 is invalid.

//importin the scanner for user input
import java.util.Scanner;
//start of class
public class averageGrade {
    //start of method
    public static void main(String[] args)
    {
        //creating the scanner
        Scanner myScanner = new Scanner(System.in);
        //declaring the initial state of the boolean for the while loop
       boolean x=true;
       // setting the variable for the number of grades equal to -1.
       //because the while loop ran with 999 entered, I offset it by making the initial number of grades = to -1
       int y = -1;
       //because the while loop ran with 999 entered, I offset it by making the total of the grades = to -999
       double total = -999;
       //beginning the while loop for entering grades. It runs based off the state of the boolean
        while (x == true) {
            //asking user for input
            System.out.println("enter grade (enter 999 to find the average of grades entered)");
            //declaring user input as a double
            double a = myScanner.nextDouble();
            //adding 1 to the number of grades entered
            y++;
            //adding the user input to the grade total
            total += a;
            //an if statement to determine if the grade entered is valid
            //if the grade is invalid the if statement removes it from number of grades and total of grades
            // the != 999 makes sure that when 999 is entered the program doesn't consider it invalid
        if (a <0 || a>100 && a != 999)
        {
            //subtracting invalid grade from total
            total -= a;
            //subtracting 1 from the number of grades entered
            y--;
            //stops the while loop and tells the user to reenter the last grade
            x= false;
            System.out.println("invalid grade entered.");
            System.out.println("please reenter the last grade entered");
    }// end of if statement
    //an if else statement that determines the average
    //when 999 is input, the program stops the while loop and displays both the number of grades entered and the average
    if (a == 999) {
        x = false;
        System.out.println("Your average for these "+ y +" grades is "+ total/y);
    }
    // if user input is not 999 and is within 0 and 100, the loop continues
    else {
        x = true;
    }//end of if esle statement
}//end of while loop
}//end of method
}//end of class