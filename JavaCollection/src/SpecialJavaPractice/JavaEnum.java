package SpecialJavaPractice;

enum Direction{
	EAST,
	WEST,
	NORTH,
	SOUTH
}

public class JavaEnum {

	public static void main(String[] args) {
		Direction dir=Direction.EAST;
		if(dir==Direction.EAST)
			System.out.println("The direction is: "+dir);
		else if(dir==Direction.WEST)
			System.out.println("The direction is: "+dir);
		else if(dir==Direction.NORTH)
			System.out.println("The direction is: "+dir);
		else
			System.out.println("The direction is: "+dir);
	}

}
