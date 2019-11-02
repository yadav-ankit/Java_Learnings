package mainPackae;

import java.io.Externalizable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizationSample implements Externalizable {


	int id;
	private String username;
	private transient String password;
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		// I can customize which fields i need to serlize
		out.writeObject(username);
		out.writeObject(password);
		out.writeObject(id);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		id = in.readInt();
		username = in.readObject().toString();
	}

	public static void main(String[] args) {
		ExternalizationSample obj = new ExternalizationSample();
		
		FileOutputStream file ;
		ObjectOutputStream out;
		
		obj.id = 3;
		obj.username = "ankit";
		
		try {
			file = new FileOutputStream("C:\\Users\\ankyadav\\Downloads\\Readable\\new4.txt");
			 out = new ObjectOutputStream(file);

			out.writeObject(obj);
			out.close();
			file.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// OverLoading is allowed
	public static void main(String[] args , int x) {
		
	}

}
