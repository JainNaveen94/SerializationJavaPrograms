package com.navtech.SerializationPrograms.simple;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationService {

	FileInputStream file;
	ObjectInputStream in;

	public DeserializationService() {
		// TODO Auto-generated constructor stub
	}

	public Object performDeserialization(String fileName) {

		try {
			// 1. Check the Existence of file
			file = new FileInputStream(fileName);
			
			// 2. Put that file as a source of reading in Object Input Stream
			in = new ObjectInputStream(file);
			
			// 3. Deserialization done here
			Object obj = in.readObject();
			
			// 4. Closing the Resources
			in.close();
			file.close();
			
			// 5. Return the Read Object
			return obj;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
