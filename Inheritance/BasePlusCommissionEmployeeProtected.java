// private superclass members cannot be accessed in a subclass

public class BasePlusCommissionEmployeeProtected extends CommissionEmployee {

	private double baseSalary; // declare private instance 

	public BasePlusCommissionEmployee2( String first, String last, String ssn, 
		double sales, double rate, double salary ) {
		// explicit call to superclass CommissionEmployee constructor
		super( first, last, ssn, sales, rate );
		
		setBaseSalary( salary );
	} // end of constructor

	public void setBaseSalary( double salary ) {

		if ( salary >= 0.0 )
			baseSalary = salary;
		else
			throw new IllegalArgumentException( "Base salary must be >= 0.0" );
	} // end of method setBaseSalary

	public double getBaseSalary() {

		return baseSalary;
	} // end of method getBaseSalary

	@Override // this annotation indicates thats that below method override superclass mehtod
	public double earnings() {
		// not allowed: commissionRate and grossSales private in superclass
		return baseSalary + ( commissionRate * grossSales );
	} // end of method earnings 

	@Override
	public String toString() {
		// not allowed: attempts to access private members of superclass
		return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f", 
			"commission employee", firstName, lastName, 
			"social security number", socialSecurityNumber, 
			"gross sales", grossSales, "commission rate", commissionRate, 
			"base salary", baseSalary ); // end of String format
	} // end of method toString
} // end of class BasePlusCommissionEmployee2