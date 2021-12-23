package TryCatchBloockUse;

public class TryCatchFinalBlock {

	public static void main(String[] args) {
		try {
			int res=20/0;
			System.out.println(res);

		}catch (Exception e) {
			System.out.println("NUMBER CAN'T BE DEVIDED BY 0 ... OTHERWISE WI WILL GET ARITHEMATICEXCEPTION!!!");
		}
		finally {
			System.out.println("Finally block gets executed every time!!!");
		}
	}

}
