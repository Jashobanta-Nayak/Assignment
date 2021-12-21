package AccessModifiers;

public class DefaultAccessMod {
	int addTwoNos(int a, int b) {
		return a+b;
	}
	int addTwo(int one, int two) {
		return one+two;
	}
	public static void main(String[] args) {
		DefaultAccessMod def=new DefaultAccessMod();
		int rs=def.addTwoNos(10, 20);
		int res=def.addTwo(5, 10);
		System.out.println(rs);
		System.out.println(res);
	}

}
