package com.navtech.SerializationPrograms.simple;

import java.util.Scanner;

import com.navtech.SerializationPrograms.services.DeserializationService;
import com.navtech.SerializationPrograms.services.SerializationService;

public class Simple {
	
	public static void processSimpleSerialization() {
		
		// Creating the Instance Of Class (Object Creation)
		Student student = new Student();
		
		// Creating the Scanner Object for User's Input
		Scanner sc = new Scanner(System.in);
		
		System.out.println(
				"\n\n************************:: Welcome To Simple Serialization Demo ::************************\n\n");
		
		// Setting the Values in the Student Object
		System.out.println("************************:: Enter the Student Object Details ::************************");
		student.setStudId(student.hashCode());
		System.out.println("Enter the Student Name :: ");
		student.setStudName(sc.nextLine());
		System.out.println("Enter the Student Address :: ");
		student.setStudAddress(sc.nextLine());
		System.out.println("Enter the Student Mobile Number :: ");
		student.setStudMobile(sc.nextLine());
		System.out.println("Enter the Student Course Name :: ");
		student.setStudCourseName(sc.nextLine());
		
		// Performing Serialization of Object Here
		System.out.println(" \n \n \n ************************:: Serialization Start Here ::************************");
		System.out.println("Serialized Object :: " + student.toString());
		SerializationService serialization = new SerializationService();
		serialization.performSerialization("student.ser", student);
		System.out.println("Serialization Finish Here :: Please Check the Serialized File");
		
		// Performing Deserialization Of Object Here
//		System.out.println("Enter Y to start Deserialisation :: ");
//		if(sc.nextLine() == "Y" || sc.nextLine() == "y") {
			System.out.println(" \n \n \n ************************:: Deserialization Start Here ::************************");
			DeserializationService deserialization = new DeserializationService();
			student = (Student) deserialization.performDeserialization("student.ser");
			System.out.println("Deserialization Finish Here \n");
			System.out.println("Object After Deserialization :: " + student.toString());
//		}
		
		// closing the Scanner Object.
		sc.close();
		
	}

}
