package com.navtech.SerializationPrograms.transient_magic;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * Serialization Auto Generate Id
	 */

	// private Field Related to Employee Model
	private static final long serialVersionUID = 1L;
	private long empId;
	private String empName;
	private String empDesignation;
	private String empMobile;
	private transient String empLocation;
	private transient Thread employeeThread;

	// Default Constructor
	public Employee() {
		employeeInitialTask();
	}

	// Parameterized Constructor
	public Employee(long empId, String empName, String empDesignation, String empMobile, String empLocation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empMobile = empMobile;
		this.empLocation = empLocation;
		employeeInitialTask();
	}

	// Getter-Setter
	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public String getEmpMobile() {
		return empMobile;
	}

	public void setEmpMobile(String empMobile) {
		this.empMobile = empMobile;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return String.format(
				"\n Employee ID : %d \n Employee Name : %s \n Employee Mobile : %s "
						+ "\n Employee Designation : %s \n Employee Location : %s \n",
				this.getEmpId(), this.getEmpName(), this.getEmpMobile(), this.getEmpDesignation(),
				this.getEmpLocation());
	}
	
	// Initial Task Which is to Be Performed By Employee Object
	public void employeeInitialTask() {
		employeeThread = new Thread(() -> {
			System.out.println("\n \n @@ Magic >>>>>>>>>>>>>>>----------------Perform Employee Task----------------<<<<<<<<<<<<<<<<<< Magic @@  \n \n ");
		}, "EmployeeThread");
		employeeThread.start();
	}
	
	/************ Magic is Here to create Two Private Method ************/
	// private write Method for Serialization
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
	}
	
	// private read Method for Deserialization
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		employeeInitialTask();
	}

}
