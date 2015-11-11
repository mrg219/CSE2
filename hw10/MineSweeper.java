// Max Grossman
// 11-12-15
// CSE 002
// The purpose of this program is to generate a minesweeper board

//importing the scanner
import java.util.Scanner;

//start of class
public class MineSweeper {
    //start of main method
    public static void main(String[] args) {
        //creating the scanner
        Scanner myScanner = new Scanner(System.in);
        //asking user for size of the board
        System.out.print("please choose the size of the board: ");
        //user input for board size
        int size = myScanner.nextInt();
        //if else statement to restric board size
        if (size > 30 || size < 2) {
            System.out.print("Sorry that size is invalid.");
        }
        else {
        //asking user for number of mines to be placed
        System.out.print("how many mines should be placed: ");
        //user input for number of mines
        int mines = myScanner.nextInt();
        //if else statement to restrict the number of mines
        if (mines < 1 || mines > (size*size)) {
            System.out.print("too many mines");
        }
        else {
        //setting the height and width of the board
        //the +2 is added to prevent OutofBoundsException errors
        int height = size+2;
        int width = size+2;
        //creating the 2d array for the board
        char[] [] board = new char [width] [height];
        //setting the number of minesplaced = to 0
        int minesplaced = 0;
        //while loop to place the number of the mines determined by the user
        while(minesplaced<mines) {
        //using math.randon to determine the location of all the mines
        int y = (int)(Math.random()*size+1);
        int x = (int)(Math.random()*size+1);
        // if statemetn to make sure that no mines are placed on top of one another
        if (board[y][x] != 'm') {
        board [y][x]= 'm';
        //incrementing the while loop
        minesplaced++;
        } // end of if statement
        } // end of while statement 
        
        //beginning of for loops to populate the 2d array
        // starting the for loops at 1 to prevent OutofBoundsException errors
        for (int y=1;y<size+1;y++) {
            for (int x =1; x<size+1; x++) {
                // setting the hitns = 0;
                int hints = 0;
                // a series of if statements to determine how many mines are around each open cell
                // hints are incremented by mines in the cells adjacent to the given cell
                if (board[y+1][x] == 'm' && board[y][x] != 'm') {
                    hints++;
                }
                if (board[y-1][x] == 'm' && board[y][x] != 'm') {
                    hints++;
                }
                if (board[y][x+1] == 'm' && board[y][x] != 'm') {
                    hints++;
                }
                if (board[y][x-1] == 'm' && board[y][x] != 'm') {
                    hints++;
                }
                if (board[y+1][x+1] == 'm' && board[y][x] != 'm') {
                    hints++;
                }
                if (board[y+1][x-1] == 'm' && board[y][x] != 'm') {
                    hints++;
                }
                if (board[y-1][x+1] == 'm' && board[y][x] != 'm') {
                    hints++;
                }
                if (board[y-1][x-1] == 'm' && board[y][x] != 'm') {
                    hints++;
                }
                // converting int hints into character
                char numbers = (char) (hints+48);
                // if statement to replace 0's with blank spaces
                if (numbers == '0') {
                    numbers = ' ';
                }
                if (board[y][x] != 'm') {
                // populating the open cells with numbers based on how many mines are nearby
                board[y][x] = numbers;
                } // end of if statements
                //printing out the board with the mines and hints
                System.out.print(board[y][x]+" ");
            } //end of inner for loop
            // forming the board into a square
            System.out.println("");
        } // end of outer for loop
        } //end of else statement
        } //end of else statement
    } //end of method
} //end of class