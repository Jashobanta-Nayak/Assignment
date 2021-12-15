package JavaOOPSProgram;
import java.util.Scanner;
public class GreaterNo {
	public static void main(String[] args) {
		// Initializing variable
		int number_one, number_two, number_three;
		
		//Dynamic Entry
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number:  ");
		number_one=sc.nextInt();
		System.out.println("Enter 2nd Number:  ");
		number_two=sc.nextInt();
		System.out.println("Enter 3rd Number:  ");
		number_three=sc.nextInt();
		sc.close();
		
		//Applying the logic		
		if(number_one > number_two && number_one > number_three ) {
			System.out.println("1st number is greatest");
		}
		if(number_two > number_one && number_two > number_three ) {
			System.out.println("2nd number is greatest");
		}
		else {
			System.out.println("3rd number is greatest");
		}
	}

}
