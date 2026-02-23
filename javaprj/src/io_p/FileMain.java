package io_p;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileMain {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("fff/dog1.jpg");
			FileOutputStream fos = new FileOutputStream("ggg/dog.jpg");
			byte [] dst = new byte[8];
			
			while(fis.available() > 0) {
				
				int len = fis.read(dst);
				
				fos.write(dst, 0, len);
			}
			
			
			fos.close();
			fis.close();
		} catch (Exception e) {
		}
	}

}
