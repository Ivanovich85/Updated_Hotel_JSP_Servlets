package training.entity;

public class Address {
	
	private int address_id;
	private String street;
	private String city;
	private String state;
	private short zipCode;
	private boolean is_international;
	
	
	
	
	public Address() {
		super();
	}


	public Address(String street, String city, String state, short zipCode, boolean is_international) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.is_international = is_international;
	}
	
	
//Setter and Getters
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public short getZipCode() {
		return zipCode;
	}
	public void setZipCode(short zipCode) {
		this.zipCode = zipCode;
	}
	public boolean getIs_international() {
		return is_international;
	}
	public void setIs_international(boolean is_international) {
		this.is_international = is_international;
	}
	public int getAddress_id() {
		return address_id;
	}
	
	
	@Override
	public String toString() {
		return "Address [address_id=" + address_id + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + ", is_international=" + is_international + "]";
	}
	
}
