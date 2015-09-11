// Max Grossman
// 11-09-15
// CSE002
// The purpose of this program is to calculate the time remaining until dinner

// importing the scanner for user input
import java.util.Scanner;
// start of the class and method
public class Timer
{
    public static void main(String[] args)
    {
        // creating the scanner for user input
        Scanner myScanner = new Scanner(System.in);
        // prompting user for the time
        System.out.print("please enter the current time (HHMM): ");
        // user's input
        int t1= myScanner.nextInt();
        // prompting user for the time of dinner
        System.out.print("please enter the time at which you will be eating dinner: ");
        // user's input
        int t2= myScanner.nextInt();
        // caclulating the number of hours using an int
        //since it's military time, I'm dividing by 100 instead of 60
        int hour1= t1/100;
        // the remainder after finding the hours gives us the minutes
        int minute1 = t1%100;
        // calculating the number of hours for time 2
        int hour2= t2/100;
        // the reaminder in minutes of time 2
        int minute2 = t2%100;
        // converting time 1 into total minutes
        // for example, 1230 would be 750 minutes
        int time1= hour1*60+minute1;
        // converting time 2 into total minutes
        int time2= hour2*60+minute2;
        // the difference between time 1 and time 2 in minutes
        int time3= time2-time1;
        // converting the difference in time into hours and minutes
        int thour= time3/60;
        int tminute=time3%60;
        // Telling the user the difference in time between now and their dinner time
        // it's in hours and minutes
        System.out.println("You have "+thour+" hours and "+tminute+" minutes until dinner.");
        
        
        }
        //end method
}
//end class