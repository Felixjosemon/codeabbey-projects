import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Ask for how many numbers needing to be converted
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to convert?");
        int amount = scanner.nextInt();

        //Asks for the numbers needed to be converted
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("What are the numbers?");

        for (int i = 0; i < amount; i++) {
            double num = scanner1.nextDouble(); //gets next num in input
            //Prints & converts next number
            System.out.print(( (int) (num * 6) + 1) + " ");
        }
    }
}
