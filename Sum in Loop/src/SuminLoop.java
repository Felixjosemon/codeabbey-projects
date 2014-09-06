import java.util.Scanner;

public class SuminLoop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nums = scanner.nextLine();
		String temp[] = nums.split(" ");
		int sum = 0;
		for(int i = 0; i < temp.length; i++) {
			sum += Integer.parseInt(temp[i]);
		}
		System.out.println(sum);
	}
}
