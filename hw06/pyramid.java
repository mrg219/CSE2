//Max Grossman
//02/10/15
//CSE 002

//This program is designed to make a pyramid out of asterisks.
//The number of rows within the pyramid is determined by the user.
//figuring out how to increment the spaces on both sides was the hardest part in creating this.


// importing the scanner
import java.util.Scanner;
//start of class
public class pyramid
{
    //start of method
    public static void main(String[] args)
    {
        //creating the scanner
        Scanner myScanner = new Scanner(System.in);
        //prompting user for the pyramid size
        System.out.print("What size pyramid? ");
        //the user input for pyramid size
        int size = myScanner.nextInt();
        //declaring a string for the symbol *
        String a = "*";
        // for loop that determines the number of rows that would be printed.
        //The number of rows is based off the size
        for(int row = 1;row<=size;row++){
            //the for loop that determines the number of spaces in each row
            // for every descending row the number of spaces on each side of the middle asterisk decrease by 2 
            //and the number of asterisks increase by 2 
            for(int space = size -1; space>= row; space--){
                System.out.print(" ");
            }// end of loop
            //the for loop that prints the asterisks to the left of the central one
            for(int left = 1; left<=row;left++){
            System.out.print(a);
        } //end of loop
        //the for loop that prints the asterisks to the right of the center one
        for(int right =1; right<=row-1;right++){
            System.out.print(a);
        } //end of loop
        //a space so that the command line isn't stuck on the bottom right of the pyramid
            System.out.println();
            
            }//end of first loop
        }//end of method
}//end of class
    
