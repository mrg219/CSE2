import java.util.Scanner;
public class ATM
{
public static void main(String[] args)
{
Scanner myScanner = new Scanner(System.in);
System.out.println("Please eneter the amount of money you wish to withdraw ");
double a1 = myScanner.nextDouble();
if (a1 < 20) {
System.out.println("Error. Not enough money to warrant a withdrawl.");
}
else {
System.out.println("Please take the amount shown: "+a1);
}
}
}
