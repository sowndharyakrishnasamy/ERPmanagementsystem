package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Result {
	@Id
	private String student_id;
	private String course_name;
	private String course_id;
	private double obtained_mark;
	@JoinColumn(name="student_id")
	private Student student;
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public double getObtained_mark() {
		return obtained_mark;
	}
	public void setObtained_mark(double obtained_mark) {
		this.obtained_mark = obtained_mark;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
