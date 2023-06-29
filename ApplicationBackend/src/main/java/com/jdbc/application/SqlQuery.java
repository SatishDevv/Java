package com.jdbc.application;

public class SqlQuery {
	public static String insertValues() {
		return"INSERT INTO userpage (id,name,phone,email,password) VALUES (?,?,?,?,?)  ";
	}
}
