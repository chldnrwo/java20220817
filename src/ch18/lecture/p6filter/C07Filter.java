package ch18.lecture.p6filter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class C07Filter {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\output\\output12.txt";
		String name2 = "C:\\Users\\user\\Desktop\\output\\output13.txt";
		FileInputStream fis = new FileInputStream(name);
		InputStreamReader is = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(is);
		
		OutputStream os = new FileOutputStream(name2);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		String line = null;
		
		while((line =br.readLine())!=null) {
			bw.write(line);
			bw.write("\n");
		}
		
		
		fis.close();
		is.close();
		br.close();
		bw.close();
		osw.close();
		os.close();
		
	}
}
