package TryCatchBloockUse;

public class TryCatchBlock {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
		int div=a/b;
		System.out.println(div);
	}catch (Exception ae) {
		System.out.println("Numbers can't be devided by zero.. otherwise it will throw ArithematicException!!!!");
	}
	}

}
