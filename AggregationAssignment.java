package AggregationProgram;

class Staff{
	String sName;
	int sId;
	Staff(String n , int i){
		this.sName=n;
		this.sId=i;
	}
	
}

class College{
	String cName;;
	String cCity;
	String cDist;
	Staff cStaff;
	College(String name , String city , String dist,Staff staff){
		this.cName=name;
		this.cCity=city;
		this.cDist=dist;
		this.cStaff=staff;
	}
	
}

public class AggregationAssignment {
	public static void main(String[] args) {
		Staff st=new Staff("Jasho",1501348062);
		
		College cl=new College("SNCollege","Soro","Balasore",st);
		System.out.println(cl.cName);
		System.out.println(cl.cCity);
		System.out.println(cl.cDist);
		System.out.println(cl.cStaff.sName);
		System.out.println(cl.cStaff.sId);
	}

}
