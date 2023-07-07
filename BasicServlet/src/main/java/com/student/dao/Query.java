package com.student.dao;

public class Query {
	
	 public static String insertStudent() {
		return"INSERT INTO student_addmisition (student_id,student_name,student_middle_name,student_last_name,student_bday,student_passout_year,student_phone,studen_lastyear_marks) VALUES(?,?,?,?,?,?,?,?) ";
	}

}
