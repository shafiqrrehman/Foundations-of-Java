public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setEmpId( 3 );
		emp.setEmpName( "Wayn" );

		System.out.printf( "\nEmployee Id: %d\nEmployee name: %s\n", 
			emp.getEmpId(), emp.getEmpName());
	}
}

class Employee {

	private int EmpId;
	private String EmpName;

	public void setEmpId( int id ) {

		EmpId = id;
	}

	public void setEmpName( String name ) {

		EmpName = name;
	}

	public int getEmpId() {

		return EmpId;
	}

	public String getEmpName() {

		return EmpName;
	}
}