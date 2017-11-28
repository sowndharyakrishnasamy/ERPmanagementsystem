package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Attendance {
	@Id
	private String student_id;
	private int noofworkinghours;
	private int noofhourspresent;
	private double percentage;
	@JoinColumn(name="student_id")
	private Student student;
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public int getNoofworkinghours() {
		return noofworkinghours;
	}
	public void setNoofworkinghours(int noofworkinghours) {
		this.noofworkinghours = noofworkinghours;
	}
	public int getNoofhourspresent() {
		return noofhourspresent;
	}
	public void setNoofhourspresent(int noofhourspresent) {
		this.noofhourspresent = noofhourspresent;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}
