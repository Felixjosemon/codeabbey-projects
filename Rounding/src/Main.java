import java.util.Scanner;

/**
 * Created by anthony on 9/3/14.
 */
public class Main {

    public static void main(String[] args) {

        //Asks for the amount or rows
        Scanner row = new Scanner(System.in);
        System.out.println("Enter how many lines you are entering.");
        int rows = row.nextInt();

        //Creates the 2-D array
        int[][] array = new int[rows][];

        //Ask for the numbers to compare
        Scanner askData = new Scanner(System.in);
        System.out.println("Please enter data");

        for (int k = 0; k < rows; k++) {
            String letsTry;

            //Assigns letsTry to the next line in the input
            letsTry = askData.nextLine();

            //Splits string/sentence into an array based on the spaces
            String[] tempArray = letsTry.split("\\s+");

            //Divides #'s and determines if need to round up
            double result = (Double.parseDouble(tempArray[0]) / Double.parseDouble(tempArray[1]));
            if ((result - Math.floor(result)) < .5) {
                System.out.print((int) Math.floor(result) + " ");
            } else {
                System.out.print((int) Math.ceil(result) + " ");
            }
        }
    }
}
