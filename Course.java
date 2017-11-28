package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {
	@Id
	private String course_id;
	private String course_name;
	private String staff_id;
	private String student_id;
	private int credit;
	private int tutorialhour;
	private int lecturehour;
	private int practicalhour;
	@ManyToOne
	private Staff staff;
	@ManyToOne
	private Student student;
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public int getTutorialhour() {
		return tutorialhour;
	}
	public void setTutorialhour(int tutorialhour) {
		this.tutorialhour = tutorialhour;
	}
	public int getLecturehour() {
		return lecturehour;
	}
	public void setLecturehour(int lecturehour) {
		this.lecturehour = lecturehour;
	}
	public int getPracticalhour() {
		return practicalhour;
	}
	public void setPracticalhour(int practicalhour) {
		this.practicalhour = practicalhour;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
	

}
