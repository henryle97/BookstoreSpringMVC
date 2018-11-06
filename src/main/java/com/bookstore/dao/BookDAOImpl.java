package com.bookstore.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/*
 * Lớp làm việc trực tiếp với DB
 */

@Repository
public class BookDAOImpl implements BookDAO {
	
	@Autowired 				//nhúng bean DriverManagerDataSource đã khởi tạo vào dataSource
	private DataSource dataSource;
	
	private Connection conn = null;
	private Statement statement = null;
	
	@Override
	public void findAll() {
		try {
			conn = dataSource.getConnection();
			statement = conn.createStatement();
			ResultSet results = statement.executeQuery("SELECT * FROM book");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
