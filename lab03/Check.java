// Max Grossman
// CSE 002
// 10-09-15
// Check program
// This program takes the input of the user in order to find the cost of the check, how much will be tipped, and how many ways the check will be split
//importing the java scanner
import java.util.Scanner;
public class Check
{
    public static void main(String[] args)
    {
        // creating the scanner
        Scanner myScanner= new Scanner(System.in);
        //asking for the check cost and user input
        System.out.print("Please enter the orginial cost of the check in the form xx.xx: ");
        double checkCost= myScanner.nextDouble();
        //asking for tip percent and user input
        System.out.print("Please enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
        double tipPercent = myScanner.nextDouble();
        //neccessary division to get percentage in proper form
        tipPercent /=100;
        //asking for number of people who went and user input
        System.out.print("Please enter the number of people who went out to dinner: ");
        int numPeople= myScanner.nextInt();
        //variables created for calculation
        double totalCost;
        double costperPerson;
        int dollars, dimes, pennies;
        //calculation to add the tip and check cost
        totalCost = checkCost*(1+tipPercent);
        // division of check by the number of people
        costperPerson= totalCost/numPeople;
        //conversion to nice numbers and calculation of total cost
        dollars=(int)costperPerson;
        dimes=(int)(costperPerson*10)%10;
        pennies=(int)(costperPerson*10)%1;
        // the result
        System.out.println("Each person in the group owes $"+dollars+'.'+dimes+pennies);
    }
    //end of method
}
//end of class