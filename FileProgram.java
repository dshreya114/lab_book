package labbook;
import java.io.*;

public class FileProgram {
	public static void main(String[] args) {
		
		try{
		String inputPath = "D:\\capg\\source.txt";
		Reader reader = new FileReader(inputPath);
		String outputPath ="D:\\capg\\target.txt";
		Writer  writer = new FileWriter(outputPath);
		
		Runnable thread1 = new CopyDataThread(reader,writer);
		Thread thread = new Thread(thread1);
		thread.start();
	}
		
	catch(Exception ex) {
		ex.printStackTrace();
	}
}
}