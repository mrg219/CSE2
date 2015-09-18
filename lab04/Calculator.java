//Max Grossman
//CSE 002
//Lab04
//17/09/15

//This porgram is designed to do the basic operations of additions, multiplication, subtraction, and division with two integers

//importing the scanner
import java.util.Scanner;
//start of class
public class Calculator
{
    //start of method
    public static void main(String[] args)
    {
        //creating the scanner
        Scanner myScanner = new Scanner(System.in);
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
    
    }
    //end method
}
//end class