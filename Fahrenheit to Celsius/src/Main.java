import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ask for the numbers that need to be converted
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers you want converted to Celsius.");
        String numbers = input.nextLine();

        //Split the input into an array
        String[] tempNumbers = numbers.split("\\s+");

        for (int i = 1; i < tempNumbers.length; i++) {
            //Sets num to the converted number(Celsius)
            double num = (((Double.parseDouble(tempNumbers[i])) - 32) * (5.0/9.0));
            //Round the Celsius and prints it
            if ((num - Math.floor(num)) < .5) {
                System.out.print((int)Math.floor(num) + " ");
            } else {
                System.out.print((int)Math.ceil(num) + " ");
            }
        }
    }
}
