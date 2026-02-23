package io_p;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteBufOutMain {

	public static void main(String[] args) {
		
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			byte [] buf = {11, 22, 33, 44, 55, 66, 77};
			
			// buf 배열 2번째부터 3개
			bos.write(buf, 2, 3);
			// buf 배열 1번째부터 4개
			bos.write(buf, 1, 4);
			// buf 배열 4번째부터 2개
			bos.write(buf, 4, 2);
			
			byte [] arr = bos.toByteArray();
			
			bos.close();
			
			System.out.println(Arrays.toString(arr));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
