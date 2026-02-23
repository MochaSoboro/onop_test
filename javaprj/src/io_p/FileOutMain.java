package io_p;

import java.io.FileOutputStream;
import java.util.Arrays;

public class FileOutMain {

	public static void main(String[] args) {
		String str = "asdfqwer asdlfkjaoxivj qwesdvoij 6846531 개나리 개나리 얼룩 개나리 %^&*!@#$%()";
		
		
		System.out.println(str);
		
		byte [] arr = str.getBytes();
		System.out.println(Arrays.toString(arr));
		
		try {
			FileOutputStream fos = new FileOutputStream("fff/bbb.txt");
			fos.write(arr);
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
