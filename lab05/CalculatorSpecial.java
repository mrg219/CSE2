//Max Grossman
//CSE 002
//Lab05
//24/09/15

//This program is designed to do the basic operations of additions, multiplication, subtraction, and division with two integers
//When the user is done with the program, they can close it by typing in "n" or "N"
//importing the scanner
import java.util.Scanner;
//start of class
public class CalculatorSpecial
{
    //start of method
    public static void main(String[] args)
    {
        
        //creating the scanner
        Scanner myScanner = new Scanner(System.in);
        //creating a boolean to determine whether the program should keep running
        boolean x = true;
        //while the boolean x is true, the calculator program will keep running
        while (x == true) {
        //prompting user for firts integer
        System.out.print("Please enter the first integer ");
        //assigning first integer to a
        int a = myScanner.nextInt();
        //prompting user for the operation
        System.out.print("Please enter the type of operation (+,-,*,/) ");
        //assigning the operation to the String c
        String c = myScanner.next();
        //prompting user for the second integer
        System.out.print("Please enter the second integer ");
        //assigning second integer to b
        int b = myScanner.nextInt();
        // creating integer d for later use in the switch statement
        int d;
        //starting the switch statement
        //depending on the operation entered different outputs will occur
        switch (c)
        {
            //the addition case
            case "+":
            //d is the addition of a and b
            d= a+b;
            //printing the result
            System.out.println("The result is: "+d);
            break;
            //the subtraction case
            case "-":
            //d is the subtraction of a and b
            d= a-b;
            //printing the result
            System.out.println("The result is: "+d);
            break;
            //the multiplication case
            case "*":
            // d is the multiplication of a and b
            d= a*b;
            //printing the result
            System.out.println("The result is: "+d);
            break;
            //the division case
            case "/":
            // d is the division of a by b
            d= a/b;
            //printing the result
            System.out.println("The result is: "+d);
            break;
            //if the operator entered isn't valid the program will default to this case
            default:
            //printing out an error message
            System.out.println("illegal operator");
            break;
        }
        //end of switch statement
        //The code below prompts the user if they wish to cintinue uisng the program
         System.out.println("do you wish to continue? ");
         System.out.println("Type n or N to stop ");
         //asking for user input
         // an input of "N" or "n" will stop the program otherwise it will keep running
        String answer = myScanner.next();
        //a simple if else statement that changes whether the boolean x is true
        //a user input of "n" or "N" will make the boolean x false and stop the program
        if ( answer.equals("n") || answer.equals("N"))
        {
            x = false;
        }
        else {
            x = true;
        }
        //end of if else statement
        }
        //end of while statement
    }
    //end of method
}
//end of class
