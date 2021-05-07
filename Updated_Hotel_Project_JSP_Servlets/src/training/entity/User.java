package training.entity;

public class User {
	//Required fields in the database
	private int user_id;
	private String username;
	private String email;
	private String name;
	
	//Not required fields in the database
	private Address address;
	
	
	//Constructors
	public User() {
		
	}
	
	public User(int user_id, String username, String email, String name) {//Constructor with required fields
		this.username = username;
		this.email = email;
		this.name = name;
	}

	public User(String username, String email, String name, Address address) {
		super();
		this.username = username;
		this.email = email;
		this.name = name;
		this.address = address;
	}

	//Setters and Getters
	public int getUser_id() {
		return user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", username=" + username + ", email=" + email + ", name=" + name
				+ ", address=" + address + "]";
	}
	
	
	
	
}
