package com.navtech.SerializationPrograms.transient_magic;

import com.navtech.SerializationPrograms.services.DeserializationService;
import com.navtech.SerializationPrograms.services.SerializationService;

public class SimpleTransientMagic {

	public static void processSerialization() {

		System.out.println(
				"\n\n----------------------- :: Welcome to the Demo of Serialization Transient :: -----------------------\n\n");

		// 1. Create the Employee Object
		Employee employee = new Employee(1, "Naveen Jain", "Associate Developer", "9999999900", "Delhi");

		// 2. Printing Before Serialization Start
		System.out.println("@@@@@@@@@ :: Printing the Employee Detail Before the Serialization Starts :: @@@@@@@@@");
		System.out.println(employee.toString());

		// 3. Perform Serialization Here
		System.out.println("------------- :: Serialization Start Here :: -------------");
		SerializationService serialization = new SerializationService();
		serialization.performSerialization("Employee.ser", employee);
		System.out.println("Serialization Finish Here :: Please Check the Serialized File \n \n");

		// 4. Perform Deserialization Here
		System.out.println("------------- :: Deserialization Start Here :: -------------");
		DeserializationService deserialization = new DeserializationService();
		employee = (Employee) deserialization.performDeserialization("Employee.ser");
		System.out.println("Deserialization Finish Here \n \n");

		// 5. Printing the Result After Deserialization
		System.out.println("@@@@@@@@@ :: Printing the Employee Details After the Deserialization Finish :: @@@@@@@@@");
		System.out.println(employee.toString());

	}

}
