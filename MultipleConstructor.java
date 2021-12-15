package JavaOOPSProgram;

class Employee{
	private int variable;
	Employee(){
		this.variable=10;
	}
	Employee(int num){
		this.variable=num;
	}
	public int getValue() {
		return variable;
	}
}

public class MultipleConstructor {

	public static void main(String[] args) {
		Employee emp=new Employee();
		Employee emp1=new Employee(100);

		System.out.println(emp.getValue());
		System.out.println(emp1.getValue());
		
	}

}
