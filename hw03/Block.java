// Max Grossman
// 11-09-15
// CSE002 
// The purpose of this program is to find the volume and surface area of a block whose size is determined by the user

//importing the scanner
import java.util.Scanner;
// start of class and method
public class Block
{
    public static void main(String[] args)
    {
        //creating the scanner
        Scanner myScanner= new Scanner(System.in);
        //prompting user for the length
        System.out.print("Please enter the length of the block: ");
        //user's input for length
        double l1= myScanner.nextDouble();
        //prompting user for the width
        System.out.print("Please enter the width of the block: ");
        //user's input for width
        double w1= myScanner.nextDouble();
        //prompting user for the height
        System.out.print("Please enter the height of the block: ");
        //user's input for the height
        double h1= myScanner.nextDouble();
        // calculation for the volume
        double v1= l1*w1*h1;
        //calculation for the area
        double a1= (l1*w1*2)+(l1*h1*2)+(w1*h1*2);
        //printing the volume and the dimensions
        System.out.println("The volume of the block of the dimensions "+l1+" x "+w1+" x "+h1+" is "+v1);
        //printing the surface area
        System.out.println("The surface area is "+a1);
    }
    //end method
}
//end class