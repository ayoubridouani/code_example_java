import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FTPServer {
	FTPServer(byte data[],String filename){
		try {
			FileOutputStream out = new FileOutputStream(filename);
			out.write(data);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}