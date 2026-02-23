package io_p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

// stream을 이용하여 짝수로 구성된 배열을 출력

public class ByteInOutMain {

	public static void main(String[] args) {
		byte [] ori = {3, 20, 127, 3, -128, -2, 3, 10, -1, 50, 111};
		
		ByteArrayInputStream bis = new ByteArrayInputStream(ori);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		while(bis.available() > 0) {
			int rr = bis.read();
			if (rr % 2 == 0) {
				bos.write(rr);
			}
		}
		
		byte [] dst = bos.toByteArray();
		
		System.out.println(Arrays.toString(dst));
		
		try {
			bos.close();
			bis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
