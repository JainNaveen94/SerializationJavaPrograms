package com.navtech.SerializationPrograms.list_of_object;

import java.util.ArrayList;
import java.util.List;

import com.navtech.SerializationPrograms.services.DeserializationService;
import com.navtech.SerializationPrograms.services.SerializationService;

public class SimpleList {

	@SuppressWarnings("unchecked")
	public static void processSerialization() {

		System.out.println(
				"\n\n----------------------- :: Welcome to the Demo of Serialization of List of Object :: -----------------------\n\n");

		// 1. Creating the List of Customer
		List<Customer> customers = new ArrayList<Customer>();

		// 2. Adding some Static Customers into the Customer List
		customers.add(new Customer(1, "Naveen", "Karol Bagh", "9999999000"));
		customers.add(new Customer(2, "Shubham", "Karol Bagh", "9999999000"));
		customers.add(new Customer(3, "Siddharth", "Usmaan Pur", "9998888000"));
		customers.add(new Customer(4, "Vipul", "Shastri Nagar", "9988999000"));
		customers.add(new Customer(5, "Deepak", "Lakshmi Nagar", "9999009000"));

		// 3. Printing the Result Before Serialization
		System.out.println("@@@@@@@@@ :: Printing the List of Object Before the Serialization Starts :: @@@@@@@@@");
		for (Customer cust : customers) {
			System.out.println(cust.toString());
		}

		// 4. Perform Serialization Here
		System.out.println("------------- :: Serialization Start Here :: -------------");
		SerializationService serialization = new SerializationService();
		serialization.performSerialization("CustomerList.ser", customers);
		System.out.println("Serialization Finish Here :: Please Check the Serialized File \n \n");

		// 5. Perform Deserialization Here
		System.out.println("------------- :: Deserialization Start Here :: -------------");
		DeserializationService deserialization = new DeserializationService();
		List<Customer> customerList = (List<Customer>) deserialization.performDeserialization("CustomerList.ser");
		System.out.println("Deserialization Finish Here \n \n");

		// 6. Printing the Result After Deserialization
		System.out.println("@@@@@@@@@ :: Printing the List of Object After the Deserialization Finish :: @@@@@@@@@");
		for (Customer cust : customerList) {
			System.out.println(cust.toString());
		}

	}

}
