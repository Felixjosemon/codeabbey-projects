import java.util.Scanner;

public class Sum {
	
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		//System.out.println("What is a?");
		int a = scanner.nextInt();
		//System.out.println("What is b?");
		int b = scanner.nextInt();
		int answer = a + b;
		System.out.println(answer);
		
	}
}
