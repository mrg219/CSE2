import java.util.Scanner;

public class move_array {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        try {
        System.out.print("What should the size of the array be? ");
        int size = myScanner.nextInt();
        int x= 1/size;
        int [] array1 = new int[size];
        for (int i =0; i < array1.length; i++) {
            array1[i] = (int)(Math.random()*100);
            System.out.print(array1[i]+" ");
        }
        System.out.println("");
        System.out.println("the value of what index should be moved to the end of the array? ");
        int value = myScanner.nextInt();
        int temp = array1[value];
        for (int j = value ; j<array1.length-1; j++) {
            array1[j] = array1[j+1];
        }
        array1[array1.length-1] = temp;
        for(int k =0; k<array1.length;k++){
            System.out.print(array1[k]+" ");
        }
        }
    catch (NegativeArraySizeException e) {
            System.out.println("Negative array size is impossible. Please try again.");
        }
    catch (ArithmeticException e) {
         System.out.println("The array size must be bigger than 0. Please try again.");
    }
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("You have an out of bounds exception. Please input a different index value.");
    }
}
}