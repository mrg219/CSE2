import java.util.Scanner;
public class coinflip {
    public static boolean flip() {
        boolean check;
        int x = (int)(Math.random()*2)+1;
        if (x == 1) {
            System.out.println("Heads " + x);
            check = true;
        }
        else  {
            System.out.println("Tails "+(x-2));
            check = false;
    }
    return check;
    }
    public static void flip(int num) {
        int heads = 0;
        int tails = 0;
        for(int i=0; i<num; i++){
            if(flip()) {
                heads++;
            }
            else{
                tails++;
            }
        }
        System.out.println("Total number of heads flipped: " + heads);
        System.out.println("Total number of tails flipped: " +tails);
    }
    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter a number between 0 and 100: ");
        int num = myScanner.nextInt();
        if (num == 0){
        flip();
        }
        else if (num > 100){
            System.exit(0);
        }
        else {
            flip(num);
        }
    }
}