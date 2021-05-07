package training.entity;

public class Hotel {
	int lic_no;
	String hotel_name;
	int rooms_available;
	Address hotelAddress;
	
	public Hotel() {
		
	}
	
	public Hotel(int lic_no, String hotel_name, int rooms_available, Address hotelAddress) {
		super();
		this.lic_no = lic_no;
		this.hotel_name = hotel_name;
		this.rooms_available = rooms_available;
		this.hotelAddress = hotelAddress;
	}
	
	//Setter and Getters
	public int getLic_no() {
		return lic_no;
	}
	public void setLic_no(int lic_no) {
		this.lic_no = lic_no;
	}
	public String getHotel_name() {
		return hotel_name;
	}
	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}
	public int getRooms_available() {
		return rooms_available;
	}
	public void setRooms_available(int rooms_available) {
		this.rooms_available = rooms_available;
	}
	public Address getHotelAddress() {
		return hotelAddress;
	}
	public void setHotelAddress(Address hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

	@Override
	public String toString() {
		return "Hotel [lic_no=" + lic_no + ", hotel_name=" + hotel_name + ", rooms_available=" + rooms_available
				+ ", hotelAddress=" + hotelAddress + "]";
	}
	
	
}
