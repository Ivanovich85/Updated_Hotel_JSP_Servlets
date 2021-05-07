package training.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import training.entity.Address;
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
			short zipCode = address.getZipCode();
			boolean is_internation = address.getIs_international();
			
			String userQuery = "Insert into Client (name, email, username) values(?,?,?)";
			String addressQuery = "Insert into Address (street, city, state, zip_code, is_international) values(?,?,?,?,?)";
			
	//Step 3: Execute SQL query
			userStatement = connect.prepareStatement(userQuery);
			userStatement.setString(1, name);
			userStatement.setString(2, email);
			userStatement.setString(3, username);
			
			addressStatement = connect.prepareStatement(addressQuery);
			addressStatement.setString(1, street);
			addressStatement.setString(2, city);
			addressStatement.setString(3, state);
			addressStatement.setShort(4, zipCode);
			addressStatement.setBoolean(5, is_internation);
			
	//Step 4: Process the result sets
			userStatement.execute();
			addressStatement.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
