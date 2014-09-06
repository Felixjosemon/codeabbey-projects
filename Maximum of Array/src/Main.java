import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int low;
        int high;
        //Ask for row of numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers!");
        String temp = scanner.nextLine();
        String[] nums = temp.split("\\s+");     //Creates array with each number

        //Assigns first number as high and low #
        low = Integer.parseInt(nums[0]);
        high = Integer.parseInt(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            //Check if next # is lower
            if (Integer.parseInt(nums[i]) < low) {
                low = Integer.parseInt(nums[i]);
            }
            //Check if next # is higher
            if (Integer.parseInt(nums[i]) > high) {
                high = Integer.parseInt(nums[i]);
            }
        }
        System.out.println(high + " " + low);
    }
}
