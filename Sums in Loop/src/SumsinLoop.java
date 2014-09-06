import java.util.Scanner;

public class SumsinLoop {
	public static void main(String[] args) {
		int n, tempSum;
		int count = 0;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("How many arrays?" );
		n = scanner.nextInt();
		int total[] = new int[n];
		
		do {
			tempSum = 0;
			Scanner secondScanner = new Scanner (System.in);
			System.out.println("What are the numbers?");
			String numbers = secondScanner.nextLine();
			String nums[] = numbers.split(" ");
			for (int i = 0; i < nums.length; i++) {
				tempSum += Integer.parseInt(nums[i]);
			}
			total[count] = tempSum;
			count += 1;
		} while(count<n);
		for (int j = 0; j < total.length; j++) {
			System.out.println(total[j]);
		}
	}
}
