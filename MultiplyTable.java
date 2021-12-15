package JavaOOPSProgram;
import java.util.Scanner;
public class MultiplyTable {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number fot multiply table");
		int num=sc.nextInt();
		sc.close();
		for(int i=1; i <= 10; i++)  
		{  
		//prints table of the entered number      
		System.out.println(num+" * "+i+" = "+num*i);  
		}
	}

}
