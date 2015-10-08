import java.util.Scanner;

public class encryptedx {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("please enter an integer between 1 and 100.");
        int input = myScanner.nextInt();
        if (input < 1 || input > 100) {
            System.exit(-1);
        }
        else {
            for(int i = 0; i <= input; i++ ) {
                for(int j = 0; j <= input; j++) {
                    if( j == i || j == input - i) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }
}

