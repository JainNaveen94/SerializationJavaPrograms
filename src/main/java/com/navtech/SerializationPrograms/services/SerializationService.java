package com.navtech.SerializationPrograms.services;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationService {
	
	FileOutputStream file;
	ObjectOutputStream out;
	
	public SerializationService() {
		// TODO Auto-generated constructor stub
	}
	
	public void performSerialization(String sourceFileName, Object obj) {
		try {
			// 1. Create or check the existence  of file
			file = new FileOutputStream(sourceFileName);
			
			// 2. Initilize the output stream to serialized the object
			out = new ObjectOutputStream(file);
			
			// 3. Searlization perform here
			out.writeObject(obj);
			
			// 4. flush the cache
			out.flush();
			
			// 5. close the  object output stream and file
			out.close();
			file.close();
			
		} catch (FileNotFoundException exception) {
			System.out.println(">>>>>>>>----------" + exception.getMessage());
		} catch (IOException exception) {
			System.out.println(">>>>>>>>----------" + exception.getMessage());
		}
		
		
	}

}
