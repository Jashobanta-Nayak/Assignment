package EncapsulationPrograms;

public class Test1 {
	public static void main(String[] args) {
		Employee em=new Employee();
		em.setEmName("Jasho");
		em.setEmDesig("Analyst");
		em.setEmSal(300000);
		em.setEmCity("BBSR");
		em.setEmPin(756042);
		em.setEmProj("React");
		System.out.println(em.getEmName());
		System.out.println(em.getEmDesig());
		System.out.println(em.getEmSal());
		System.out.println(em.getEmCity());
		System.out.println(em.getEmPin());
		System.out.println(em.getEmProj());
	}

}
