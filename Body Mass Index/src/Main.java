import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ask for amount of tests
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many tests?");
        int amount = scanner.nextInt();

        //Ask for test data
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("What are the values?");

        for (int i = 0; i < amount; i++) {
            //Get the weight and height
            double w = (double) scanner1.nextInt();
            double h = scanner1.nextDouble();
            double bmi = w / (h * h); //calculate bmi
            //get the result/range
            if (bmi < 18.5) {
                System.out.print("under ");
            } else if (18.5 <= bmi && bmi < 25) {
                System.out.print("normal ");
            } else if (25 <= bmi && bmi < 30) {
                System.out.print("over ");
            } else {
                System.out.print("obese ");
            }
        }
    }
}
