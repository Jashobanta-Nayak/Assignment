package JavaOOPSProgram;

public class SumAvg {
	public static void main(String[] args) {
		//Declaring variable
		int num=5,  sum=0 , avg=0;
		//Count will start from 1 to 5.
		for(int natural =1; natural<=num; natural++) {
			sum += natural; //Putting formula for sum
			avg = sum/num; ////Putting formula for avg
		}
		
		System.out.println("Sum of first 5 natural numbers is : " + sum);
		System.out.println("Average of first 5 natural numbers is : " + avg);
		

	}

}
