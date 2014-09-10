import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ask for the amount of rows
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows you have.");
        int rows = scanner.nextInt();

        //Ask for the numbers to be checked
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("The the numbers.");

        for (int i = 0; i < rows; i++) {
            //Assigns next line in the numbers to 'numbers'
            String numbers = scanner1.nextLine();

            //Split the line into an array
            String[] arrayNums = numbers.split("\\s+");
            int[] arrayTemp = new int[3];

            //Check to see if 1st var is higher or lower than 2nd
            if (conInt(arrayNums[0]) > conInt(arrayNums[1])) {
                arrayTemp[2] = conInt(arrayNums[0]);
                arrayTemp[0] = conInt(arrayNums[1]);
            } else {
                arrayTemp[0] = conInt(arrayNums[0]);
                arrayTemp[2] = conInt(arrayNums[1]);
            }

            //Checks to see if the 3rd viable is the median
            if (conInt(arrayNums[2]) < arrayTemp[0]) {
                System.out.print(arrayTemp[0] + " ");
            } else if (conInt(arrayNums[2]) > arrayTemp[2]) {
                System.out.print(arrayTemp[2] + " ");
            } else {
                System.out.print(conInt(arrayNums[2]) + " ");
            }

        }
    }
    //Method to parse a String to int
    public static int conInt(String num) {
        return Integer.parseInt(num);
    }
}
