import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ask for number of line
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many phrases?");
        int amount = scanner.nextInt();

        //Ask for the phrases
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter the phrases");

        for (int i = 0; i < amount; i++) {
            int count = 0;
            String temp = scanner1.nextLine();
            for (int j = 0; j < temp.length(); j++) {
                //Checks to see if the letter is a vowel and increments
                if (temp.substring(j, j + 1).equals("a")) {
                    count++;
                } else if (temp.substring(j, j + 1).equals("e")) {
                    count++;
                } else if (temp.substring(j, j + 1).equals("i")) {
                    count++;
                } else if (temp.substring(j, j + 1).equals("o")) {
                    count++;
                } else if (temp.substring(j, j + 1).equals("u")) {
                    count++;
                } else if (temp.substring(j, j + 1).equals("y")) {
                    count++;
                }
            }
            System.out.print(count + " ");
        }
    }
}
