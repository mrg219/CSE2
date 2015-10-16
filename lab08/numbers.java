import java.util.Scanner;

public class numbers {
       public static double mean(double n1, double n2, double n3, double n4, double n5, double n6, double n7, double n8, double n9, double n10) {
      return (n1+n2+n3+n4+n5+n6+n7+n8+n9+n10)/10;
    }
       public static double median(double n1, double n2, double n3, double n4, double n5, double n6, double n7, double n8, double n9, double n10) {
           return(n5+n6)/2;
       }
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("please enter the numbers from greatest to least");
        System.out.print("please input the first number: ");
        double n1 = myScanner.nextDouble();
        System.out.print("please input the second number: ");
        double n2 = myScanner.nextDouble();
        System.out.print("please input the third number: ");
        double n3 = myScanner.nextDouble();
        System.out.print("please input the fourth number: ");
        double n4 = myScanner.nextDouble();
        System.out.print("please input the fifth number: ");
        double n5 = myScanner.nextDouble();
        System.out.print("please input the sixth number: ");
        double n6 = myScanner.nextDouble();
        System.out.print("please input the seventh number: ");
        double n7 = myScanner.nextDouble();
        System.out.print("please input the eigth number: ");
        double n8 = myScanner.nextDouble();
        System.out.print("please input the ninth number: ");
        double n9 = myScanner.nextDouble();
        System.out.print("please input the tenth number: ");
        double n10 = myScanner.nextDouble();
        double m = mean(n1, n2, n3, n4, n5, n6, n7, n8, n9, n10);
        System.out.println("the mean of the ten numbers is: "+ m);
        double m2 = median(n1, n2, n3, n4, n5, n6, n7, n8, n9, n10);
        System.out.println("the median of the ten numbers is: "+ m2);
    }
}
