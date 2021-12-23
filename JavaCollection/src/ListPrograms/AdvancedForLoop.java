package ListPrograms;
import java.util.Scanner;
import java.util.ArrayList;
public class AdvancedForLoop {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array you want to add: ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+" values: ");
		int i;
		for(i=0;i<n;i++) {
			ar[i]=sc.nextInt();

		}
		al.add(ar[i]);
		for(int values:al) {
			System.out.println("ArrayList elements added using for loop "+values);
		}
	}
}


