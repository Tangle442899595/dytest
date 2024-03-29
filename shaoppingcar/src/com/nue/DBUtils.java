package com.nue;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBUtils {
	/*private String driverClassName = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=UTF-8";
	private String username = "root";
	private String password = "root";*/

	public Connection getConnection() throws SQLException, ClassNotFoundException, NamingException {
		/*Class.forName(driverClassName);
		Connection connection = DriverManager.getConnection(url, username, password);*/
		//创建一个上下文对象
		Context context = new InitialContext();
		//在context中，查找外部资源
		DataSource ds  = (DataSource)context.lookup("java:comp/env/jdbc/mydatasource");
		
		Connection connection = ds.getConnection();
		return connection;
	}

	public void closeConnection(Connection connection) throws SQLException {
		connection.close();
	}

	public int executeUpdate(String sql, Object... params) throws SQLException, ClassNotFoundException, NamingException {
		Connection connection = getConnection();

		PreparedStatement statement = connection.prepareStatement(sql);
		if (params != null) {
			// 把params中每一个值，赋值给sql语句中的占位符（？）
			for (int i = 0; i < params.length; i++) {
				statement.setObject(i + 1, params[i]);
			}
		}

		int n = statement.executeUpdate();

		statement.close();

		closeConnection(connection);

		return n;
	}

	public ResultSet executeQuery(Connection connection, String sql, Object... params) throws SQLException, ClassNotFoundException {
//		Class.forName(driverClassName);
		PreparedStatement statement = connection.prepareStatement(sql);
		if (params != null) {
			// 把params中每一个值，赋值给sql语句中的占位符（？）
			for (int i = 0; i < params.length; i++) {
				statement.setObject(i + 1, params[i]);
			}
		}

		ResultSet rs = statement.executeQuery();

		return rs;
	}
}
