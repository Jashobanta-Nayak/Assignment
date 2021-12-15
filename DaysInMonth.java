package JavaOOPSProgram;
import java.util.Scanner;
public class DaysInMonth {
	public static void main(String[] args) {
		//Declaring a variable
		String month;
		
		//Dynamic Entry
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your favorite month:  ");
		month=sc.next();
		sc.close();
		
		//Entering To The Switch Case
		switch(month){
		case "january":
		case "march":
		case "may":
		case "july":
		case "august":
		case "october":
		case "december":
		System.out.println("There are 31 days in the month");
		break;	
		case "april":
		case "june":
		case "september":
		case "november":
		System.out.println("There are 30 days in the month");
		break;		
		case "february":
		System.out.println("There are either 28 or 29 days in the month");
		break;
		default:
		System.out.println("Please enter a valid number between 1-12");	
		}
	}
}
