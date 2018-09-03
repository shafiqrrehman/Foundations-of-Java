public class BasePlusCommissionEmployeeProtectedTest {

	public static void main(String[] args) {
		
		CommissionEmployee employee = new CommissionEmployee( 
			"Wayn", "Baloch", "222-22-2222", 10000, 0.6 );

		System.out.println( "\nEmployee information obtained by get methods:\n" );
		System.out.printf( "%s %s\n", 
			"First name is", employee.getFirstName() );
		System.out.printf( "%s %s\n", 
			"Lasst name is", employee.getLastName() );
		System.out.printf( "%s %s\n", 
			"Social security number is", employee.getSocialSecurityNumber() );
		System.out.printf( "%s %.2f\n", 
			"Gross sales is", employee.getGrossSales() );
		System.out.printf( "%s %s\n", 
			"Commission rate is", employee.getCommissionRate() );

		employee.setGrossSales( 500 );
		employee.setCommissionRate( .1 );

		System.out.printf( "\n%s:\n\n%s\n", 
			"Updated employee information obtained by toString", employee );
	}
}