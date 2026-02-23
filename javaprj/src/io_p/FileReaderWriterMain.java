package io_p;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileReaderWriterMain {

	public static void main(String[] args) {
		try {
			Reader rr = new FileReader("fff/aaa.txt");
			Writer ww = new FileWriter("ggg/eee.txt");
			char [] buf = new char[8];
			
			while(true) {
				
				int len = rr.read(buf);
				if (len < 0) {
					break;
				}
				
				String ttt = new String(buf, 0, len);
				System.out.println(ttt+" : "+len);
				ww.write(ttt);
			}
			
			
			ww.close();
			rr.close();
		} catch (Exception e) {
		}
	}

}
