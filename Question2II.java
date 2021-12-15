package JavaOOPSProgram;
import java.util.Scanner;
public class Question2II {
	public static void main(String[] args) {
		int number_1, number_2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		number_1=sc.nextInt();
		System.out.println("The number is----> "+number_1);
		number_1 +=32;
		System.out.println("The number after += operator is----> "+number_1);
		number_1 -=32;
		System.out.println("The number after -= operator is----> "+number_1);
		number_1 *=32;
		System.out.println("The number after *= operator is----> "+number_1);
		number_1 /=32;
		System.out.println("The number after /= operator is----> "+number_1);
		number_1 %=32;
		System.out.println("The number after %= operator is----> "+number_1);
		System.out.println("==========================================================================================");
		System.out.println("Enter your second number: ");
		number_2=sc.nextInt();
		System.out.println("The number is----> "+number_2);
		number_2 +=43;
		System.out.println("The number after += operator is----> "+number_2);
		number_2 -=43;
		System.out.println("The number after -= operator is----> "+number_2);
		number_2 *=43;
		System.out.println("The number after *= operator is----> "+number_2);
		number_2 /=43;
		System.out.println("The number after /= operator is----> "+number_2);
		number_2 %=43;
		System.out.println("The number after %= operator is----> "+number_2);

	}

}
