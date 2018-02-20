package data;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
//import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import bus.*;

public class FileHandler {
	//Write to serialized file
	public static void writeToFile(ArrayList<Employee> emp) throws IOException{
		FileOutputStream outFile = new FileOutputStream("src/data/employee.ser");
		ObjectOutputStream outStream = new ObjectOutputStream(outFile);
		outStream.writeObject(emp);
	}

	//Read from serialized file
	public static ArrayList<Employee> readFromFile () throws IOException, ClassNotFoundException, FileNotFoundException {
		ArrayList<Employee> employeeFromFile = new ArrayList<Employee>();
		FileInputStream inFile = new FileInputStream("src/data/employee.ser");
		ObjectInputStream inStream = new ObjectInputStream(inFile);			
		employeeFromFile =  (ArrayList<Employee>) inStream.readObject();
		return employeeFromFile;
	}
}
