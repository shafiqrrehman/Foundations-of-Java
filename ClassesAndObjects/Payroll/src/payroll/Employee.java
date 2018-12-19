package payroll;


public class Employee implements Comparable<Object> {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private Address address;
	private int employeeID;
	private int deptID;
	private String title;
	private double salary;
	
	public Employee(String fName, String lName, String pNumber, Address address, 
			int employeeID, int deptID, String title, double salary) {
		
		firstName = fName;
		lastName = lName;
		phoneNumber = pNumber;
		this.address = address;
		this.employeeID = employeeID;
		this.deptID = deptID;
		this.title = title;
		this.salary = salary;
	}
	

	public String getName() {
		return firstName + " " + lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public int getDeptID() {
		return deptID;
	}

	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public void printEmployee() {
		
		System.out.println(lastName + ", " + firstName + "\nTitle: " + title 
				+ "\nAddress " + address.toString() + "\n\nEmployeeID: " + employeeID 
				+ "\nDepartment: " + getDeptName(deptID) );
		System.out.printf("Salary: %8.2f", salary);
		System.out.println();
	}

	public String getDeptName(int value) {
		
		switch (value) {
		case 001:
			return "Human Resource";
		
		case 002:
			return "Faculty";
			
		case 003:
			return "Staff";
			
		case 004:
			return "Administration";

		default:
			return "Other";
		}
	}
	


	@Override
	public int compareTo(Object o) {
		
		Employee emp = (Employee) o;
		if (this.salary > emp.salary ) {
			return 1;
		} else if (this.salary == emp.salary) {
			return 0;
		} else {
			return -1;
		}
	}

}
