package com.navtech.SerializationPrograms.simple;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * To Declare the SerialVersion ID
	 */

	// Private Field Related to Student Model Class
	private static final long serialVersionUID = 1L;
	private long studId;
	private String studName;
	private String studAddress;
	private String studMobile;
	private String studCourseName;

	// Default Constructor
	public Student() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	public Student(long studId, String studName, String studAddress, String studMobile, String studCourseName) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studAddress = studAddress;
		this.studMobile = studMobile;
		this.studCourseName = studCourseName;
	}

	// Getter-Setter
	public long getStudId() {
		return studId;
	}

	public void setStudId(long studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudAddress() {
		return studAddress;
	}

	public void setStudAddress(String studAddress) {
		this.studAddress = studAddress;
	}

	public String getStudMobile() {
		return studMobile;
	}

	public void setStudMobile(String studMobile) {
		this.studMobile = studMobile;
	}

	public String getStudCourseName() {
		return studCourseName;
	}

	public void setStudCourseName(String studCourseName) {
		this.studCourseName = studCourseName;
	}

	@Override
	public String toString() {
		return String.format(
				"\n Student ID : %d \n Student Name : %s \n Student Address : %s \n "
				+ "Student Mobile : %s \n Student Mobile : %s \n",
				this.getStudId(), this.getStudName(), this.getStudAddress(), this.getStudMobile(),
				this.getStudCourseName());
	}

}
