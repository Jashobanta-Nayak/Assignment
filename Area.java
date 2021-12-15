package JavaOOPSProgram;
import java.util.Scanner;
public class Area {
	public static void main(String[] args) {
		//declaration of variable
		int area;
		int length;
		int breadth;
		int side ;
		//Dynamic entry for rectangle
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");//For rectangle
		length=sc.nextInt();
		System.out.println("Enter the breadth of the rectangle");//For rectangle
		breadth=sc.nextInt();
		
		{//For Rectangle
			area= length*breadth;//Formula for area of rectangle
			System.out.println("The area of rectangle is: "+area);
		}
		//Dynamic entry for cube
		System.out.println("Enter the sides of the cube");//For Cube
		side=sc.nextInt();
		sc.close();
		{//For Cube
			area= 6*(side*side);//Formula for area of cube
			System.out.println("The area of cube is: "+area);
		}

	}


}
