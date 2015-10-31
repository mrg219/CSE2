import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("how many values should be stored in the array? ");
        int x = myScanner.nextInt();
        int[] userarray = new int[x];
        for (int i= 0; i < userarray.length; i++) {
            userarray[i] = (int)(Math.random()*100);
        }
        for (int j =0; j < userarray.length; j++) {
            System.out.println(userarray[j]);
        }
        int sum = 0;
        for (int k = 0; k < userarray.length; k++) {
            sum = sum + userarray[k];
        }
        System.out.println("The sum of the array is: "+ sum);
        System.out.println("The average of the array values is: "+ (sum/userarray.length));
        double average = (sum/userarray.length);
        for (int l =0; l < userarray.length; l++) {
            if (userarray[l] >= average) {
                System.out.println("The value "+ userarray[l] +" is greater than the average");
            }
        }
    }
}