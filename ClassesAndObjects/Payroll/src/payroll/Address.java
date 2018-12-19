package payroll;

public class Address implements Comparable<Object> {

	private String houseNumber;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zipCode;
	
	public Address(String houseNum, String address1, String address2, String city, 
			String state, String zipCode) {
		
		houseNumber = houseNum;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	public Address(String houseNum, String address1,             
            String city, String state, String zip) {
		
        houseNumber = houseNum;
        this.address1 = address1;
        this.address2 = "";
        this.city = city;
        this.state = state;
        this.zipCode = zip;
    }
	
	@Override
	public String toString() {
		
		if (address2.equals("")) {
			
			return (houseNumber + " "
	                + address1 +"\n" + city + ", "+ state + 
	                    " " + zipCode);
		} else {
			
			return(houseNumber + " "
	                + address1 +"\n" + address2 + "\n" +
	                city + ", "+ state + " " + zipCode);
		}
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Address addr = (Address)o;
        int zip1 = Integer.parseInt(this.zipCode);
        int zip2 = Integer.parseInt(addr.zipCode);
        if(zip1 < zip2)
            return -1;
        else if (zip1 > zip2)
            return 1;
        else
            return 0;
	}
	
	
}
