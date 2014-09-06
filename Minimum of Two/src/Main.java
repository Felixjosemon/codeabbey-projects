import java.util.Scanner;
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
            int newSpace = 0;
            int checkingNumber;
            char nullChar = '\u0000'; //assigns nullChar to a null thing

            //Assigns letsTry to the next line in the input
            letsTry = askData.nextLine();

            //Splits string/sentence into an array based on the spaces
            String[] tempArray = letsTry.split("\\s+");

            //Sets the staring # to checkingNumber
            checkingNumber = Integer.parseInt(tempArray[0]);

            //Checking for lowest number in the array
            for (int i = 1; i < tempArray.length; i++) {
                if (Integer.parseInt(tempArray[i]) < checkingNumber) {
                    checkingNumber = Integer.parseInt(tempArray[i]);
                }
            }
            System.out.print(checkingNumber + " ");
        }
    }
}
