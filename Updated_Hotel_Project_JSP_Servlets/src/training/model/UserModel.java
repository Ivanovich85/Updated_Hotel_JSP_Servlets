package training.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import training.entity.Address;
import training.entity.Hotel;
import training.entity.User;

public class UserModel {

	public void addUser(DataSource dataSource, User newUser) {
		
	//Step 1: Initialize connection objects
		Connection connect = null;
		PreparedStatement userStatement = null;
		PreparedStatement addressStatement = null;
		
		try {
			connect = dataSource.getConnection();
	//Step 2:  Create a SQL statement string
			//Getting Users Information
			String username = newUser.getUsername();
			String email = newUser.getEmail();
			String name = newUser.getName();
			//Getting Users Address
			Address address = newUser.getAddress();
			String street = address.getStreet();
			String city = address.getCity();
			String state = address.getState();
			int zipCode = address.getZipCode();
			boolean is_internation = address.getIs_international();
			boolean is_hotel = false;//creating a user so by default this will be false
			
			String userQuery = "Insert into Client (name, email, username) values(?,?,?)";
			String addressQuery = "Insert into Address (street, city, state, zip_code, is_international, is_hotel) values(?,?,?,?,?, ?)";
			
	//Step 3: Execute SQL query
			userStatement = connect.prepareStatement(userQuery);
			userStatement.setString(1, name);
			userStatement.setString(2, email);
			userStatement.setString(3, username);
			
			addressStatement = connect.prepareStatement(addressQuery);
			addressStatement.setString(1, street);
			addressStatement.setString(2, city);
			addressStatement.setString(3, state);
			addressStatement.setInt(4, zipCode);
			addressStatement.setBoolean(5, is_internation);
			addressStatement.setBoolean(6, is_hotel);
			
	//Step 4: Process the result sets
			userStatement.execute();
			addressStatement.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Hotel> listHotels(DataSource dataSource) {
	//Step 1: Initialize connection objects
		List<Hotel> listHotels = new ArrayList<>();
		Connection connect = null;
		Statement statement = null;
		ResultSet rs = null;
		
		try {
			connect = dataSource.getConnection();
	//Step 2:  Create a SQL statement string
			String query = "Select * From Hotel Inner Join Address on "+
					            "Address.address_id = Hotel.hotel_Address_id";
			statement = connect.createStatement();
			
	//Step 3: Execute SQL query
			rs = statement.executeQuery(query);
		
	//Step 4: Process the result sets		
			while(rs.next()) {
				listHotels.add(new Hotel(rs.getInt("lic_no"), rs.getString("hotel_name"), rs.getInt("rooms_available"), 
							   new Address(rs.getInt("address_id") ,rs.getString("street"), rs.getString("city"), rs.getString("state"), 
									   	   rs.getInt("zip_code"), rs.getBoolean("is_international"), rs.getBoolean("is_hotel"))
							   ));
			}
			for(Hotel hotel: listHotels) {
				System.out.println(hotel);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listHotels;
	}
	
}
