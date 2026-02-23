package io_p;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteOutMain {

	public static void main(String[] args) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		bos.write(34);
		bos.write(50);
		bos.write(-50);
		bos.write(127);
		bos.write(129);		// -127
		bos.write(-1);
		bos.write(254);		// -2
		bos.write(255);		// -1
		bos.write(256);		// 0
		bos.write(257);		// 1
		bos.write(-126);
		bos.write(300);		// 44 (300-256)
		
		byte [] dst = bos.toByteArray();
		
		System.out.println(Arrays.toString(dst));
		
		try {
			bos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
