package TryCatchBloockUse;

public class TryCatchBlock1 {

	public static void main(String[] args) {

		try {
			int[] ar= {10,20,30,50};
			System.out.println(ar[2]);
		}catch (Exception e) {
			System.out.println("Value isn't present inside this Array!!!");
		}
	}
}
