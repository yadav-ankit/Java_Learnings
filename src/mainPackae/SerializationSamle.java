package mainPackae;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationSamle implements Serializable {

	private static final long serialVersionUID = 1L;

	int id;
	private String username;
	private transient String password;

	public static void main(String[] args) {

		String filePath = "C:\\\\Users\\\\ankyadav\\\\Downloads\\\\Readable\\\\new4.txt";
		SerializationSamle obj = new SerializationSamle();
		FileOutputStream file;
		ObjectOutp
		utStream out;

		obj.id = 3;
		obj.username = "ankit";
		obj.password = "trypass";

		try {
			file = new FileOutputStream(filePath);
			out = new ObjectOutputStream(file);

			out.writeObject(obj);
			out.close();
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		SerializationSamle obj1 = null;
		
		// Deserialize the object
		try {
			
			FileInputStream fi = new FileInputStream(filePath);
			ObjectInputStream si = new ObjectInputStream(fi);
			obj1 = (SerializationSamle) si.readObject();
			
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println(obj1.id + " " + obj1.username + " " + obj1.password);
	}

}
