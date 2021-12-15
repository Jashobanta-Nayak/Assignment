package JavaOOPSProgram;
import java.util.Scanner;
public class Question3II {
	public static void main(String[] args) {
		int mr, cj;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your first value: ");
		mr=sc.nextInt();
		
		System.out.println("Enter your second value: ");
		cj=sc.nextInt();
		sc.close();
		
		System.out.println("Before Decrement"+mr);
		System.out.println("Before Decrement"+cj);
		mr--;
		cj--;
		System.out.println("After 1st Decrement"+mr);
		System.out.println("After 1st Decrement"+cj);
		mr--;
		cj--;
		System.out.println("After 2nd Decrement"+mr);
		System.out.println("After 2nd Decrement"+cj);
		

	}

}
