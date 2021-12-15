package JavaOOPSProgram;
import java.util.Scanner;
public class LeapYear {
public static void main(String[] args) {
		
		// Initializing variable
				int leap;
				
				//Dynamic Entry
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your desired year :  ");
				leap=sc.nextInt();
				sc.close();
				
				//Applying the logic		
				if(leap % 4 ==0 ) {
					System.out.println("The year is a leap year");
				}
				else {
					System.out.println("The year is not a leap year");
				}
	}

}
