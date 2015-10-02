//Max Grossman
//02/10/15
//CSE 002
//Lab 06

//The purpose of this prgram is to record and print the payroll for a number of employess determined by the user.

//importing the scanner
import java.util.Scanner;

//start of class
public class timeSheets {
    //start of method
    public static void main(String[] args)
    {
        //creating the scanner
        Scanner myScanner = new Scanner(System.in);
        //prompting the user for input
        System.out.print("please enter the number of timesheets to read: ");
        // user input for the number of timesheets
        int nSheets = myScanner.nextInt();
        // decalring the total initial amount that has to be paid
        double total = 0;
            //the while statement that continues to loop until the number of timesheets is equal to zero
            while(nSheets>0) {
                //the rate of pay for the first time sheet
                System.out.print("please enter the rate of pay for sheet "+nSheets+": ");
                //user input for the pay rate
                double rate = myScanner.nextDouble();
                //declaring the inital amount of total hours worked
                int thour = 0;
                //a for loop that prompts the user for the hours worked for monday through friday
                for (int day = 1 ;day<6;day++) {
                    //prompting the user for hours worked
                    System.out.print("please enter hours worked for day " +day+": ");
                    //user input for hours worked
                    int hour = myScanner.nextInt();
                    //thours that increases each time the loop runs
                    thour = thour+hour;
                }//end of for loop
                // declaring pay by multiplying rate by numebr of hours worked
            double pay = rate*(thour);
            // total amount that must be paid
            //This increases for each timesheet that is entered
            total = total+pay;
            //outputting the amount owed for a specific timesheet
            System.out.println("amount owed to employee "+ nSheets +": " +(rate*(thour)));
            //the total amount owed
            System.out.println("total payroll: "+total);
            //subtracting 1 from the number of sheets so that the next sheet can start
            nSheets--;
        }//end of while loop
    }//end of method
}//end of class