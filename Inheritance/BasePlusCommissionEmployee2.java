// private superclass members cannot be accessed in a subclass

public class BasePlusCommissionEmployee2 extends CommissionEmployee {

	private double baseSalary;

	public BasePlusCommissionEmployee2( String first, String last, String ssn, 
		double sales, double rate, double salary ) {
		// explicit call to superclass CommissionEmployee constructor
		super( first, last, ssn, sales, rate );
		
		setBaseSalary( salary );
	}

	public void setBaseSalary( double salary ) {

		if ( salary >= 0.0 )
			baseSalary = salary;
		else
			throw new IllegalArgumentException( "Base salary must be >= 0.0" );
	}

	public double getBaseSalary() {

		return baseSalary;
	}

	@Override
	public double earnings() {
		// not allowed: commissionRate and grossSales private in superclass
		return baseSalary + ( commissionRate * grossSales );
	}

	@Override
	public String toString() {
		// not allowed: attempts to access private members of superclass
		return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f", 
			"commission employee", firstName, lastName, 
			"social security number", socialSecurityNumber, 
			"gross sales", grossSales, "commission rate", commissionRate, 
			"base salary", baseSalary );
	} // end of method toString
} // end of class BasePlusCommissionEmployee2