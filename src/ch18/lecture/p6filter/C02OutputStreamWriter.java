package ch18.lecture.p6filter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class C02OutputStreamWriter {
	public static void main(String[] args) throws IOException {
		String name = "C:\\Users\\user\\Desktop\\output\\output9.txt";
		
		FileOutputStream fos= getFileOutputStream(name);
		Writer wr = new OutputStreamWriter(fos);
		
//		fos.write('a');
//		fos.write('b');
//		fos.write('가');
//		fos.write('나');
		
		wr.write('a');
		wr.write('b');
		wr.write('가');
		wr.write('나');
		
		wr.close();
	}

	private static FileOutputStream getFileOutputStream(String name) throws FileNotFoundException {
		// TODO Auto-generated method stub
		return new FileOutputStream(name);
	}
	
	
}
