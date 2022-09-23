package ch18.lecture.p6filter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;



public class C06Filter {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\output\\output12.txt";
		FileInputStream fis = new FileInputStream(name);
		InputStreamReader is = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(is);
		
		String line = null;
		
		while((line =br.readLine())!=null) {
			System.out.println(line);
		}
		
		fis.close();
		is.close();
		br.close();
		
		
	}
}
