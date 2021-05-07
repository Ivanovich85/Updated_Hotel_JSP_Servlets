package training.entity;

public class Address {
	
	private int address_id;
	private String street;
	private String city;
	private String state;
	private int zipCode;
	private boolean is_international;
	private boolean is_hotel;
	
	
	
	public Address() {
		super();
	}

	public Address(String street, String city, String state, int zipCode, boolean is_international) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.is_international = is_international;
	}

	public Address(int address_id,String street, String city, String state, int zipCode, boolean is_international, boolean is_hotel) {
		super();
		this.address_id = address_id;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.is_international = is_international;
		this.is_hotel = is_hotel;
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
	public int getZipCode() {
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
	
	public boolean isIs_hotel() {
		return is_hotel;
	}

	public void setIs_hotel(boolean is_hotel) {
		this.is_hotel = is_hotel;
	}


	@Override
	public String toString() {
		return "Address [address_id=" + address_id + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + ", is_international=" + is_international + "]";
	}
	
}
