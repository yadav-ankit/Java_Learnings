import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Base64;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;

public class Image {

	
	protected static Blob Base64ToBlob(String base64ImageString) throws SerialException, SQLException {
		byte[] decodedByte = Base64.getDecoder().decode(base64ImageString);
		
		Blob blob = new SerialBlob(decodedByte);

		return blob;

	}
	
	protected static String BlobToBase64(Blob b) throws SQLException{
		
		byte[] imageByte = b.getBytes(1, (int) b.length());   //from DB
	
		
		b.free();
		 
		 String imgString = Base64.getEncoder().encodeToString(imageByte) ;//  encodeToString(encodedImage);
                 
		 
		return  imgString;
	}
	
	
	public static void main(String[] args) throws Exception{
		 /*
		  * 1: Image to Base 64 (s1)
		  * 2: Base 64 to Blob 
		  *	3: Blob to Base 64 (s2)
		  * 4: Check if s1 == s2
		  */
        File f =  new File("C:\\Users\\ankyadav\\Downloads\\House.png");
          String base64inputstring = encodeFileToBase64Binary(f);
          
          System.out.println(base64inputstring);
          
          System.out.println("            ");
          
          Blob b = Base64ToBlob(base64inputstring);
          
          String outputbase64String = BlobToBase64(b);
          
          System.out.println(outputbase64String);
          
          System.out.println("       ");
          
          if(outputbase64String.equals(base64inputstring)) {
        	  System.out.println("Done !!!!!!!");
          }else {
        	  System.out.println("Nooooooooo");
          }
    }

    private static String encodeFileToBase64Binary(File file) throws Exception{
         FileInputStream fileInputStreamReader = new FileInputStream(file);
         byte[] bytes = new byte[(int)file.length()];
         fileInputStreamReader.read(bytes);
         
         
         return Base64
                 .getEncoder()
                 .encodeToString(bytes);
     }
}
