package AccessModifiers;

public class PrivateAccessMod {
	private String name="jasho";
	private int square(int a) {
		return a*a;
	}
	public static void main(String[] args) {
		PrivateAccessMod pv=new PrivateAccessMod();
		System.out.println(pv.name);
		int rs=pv.square(10);
		System.out.println(rs);
	}

}
