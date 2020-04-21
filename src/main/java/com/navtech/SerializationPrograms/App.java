package com.navtech.SerializationPrograms;

import com.navtech.SerializationPrograms.list_of_object.SimpleList;
import com.navtech.SerializationPrograms.transient_magic.SimpleTransientMagic;
import com.navtech.SerializationPrograms.simple.Simple;

public class App {
	public static void main(String[] args) {

		System.out.println(
				"\n\n---------------------------------------------------************************:: Welcome To Serialization APP ::************************---------------------------------------------------\n\n");

		/******* Perform the Simple Serialization Demo ********/
		Simple.processSimpleSerialization();

		/******* Perform the List Of Object Serialization Demo ********/
		SimpleList.processSerialization();

		/******* Perform the Object with Transient Serialization Demo ********/
		SimpleTransientMagic.processSerialization();

	}
}
