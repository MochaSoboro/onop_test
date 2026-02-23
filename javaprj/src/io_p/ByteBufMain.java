package io_p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
 * 
ByteBufMain
byte [] data1 = {1,3,5,7,9,11,13,15,17,19,21,23,25};
byte [] data2 = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-11,-12,-13,-14};
byte [] data3 = {101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118};

buf 를 이용하여 데이터를 읽어와서
한개의 배열로 출력하세요
 * */

public class ByteBufMain {

	public static void main(String[] args) {
		byte [] data1 = {1,3,5,7,9,11,13,15,17,19,21,23,25};
		byte [] data2 = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-11,-12,-13,-14};
		byte [] data3 = {101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118};
		
		byte [] buf = new byte[5];
		
		try {
			ByteArrayInputStream bis = new ByteArrayInputStream(data1);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			
			while (bis.available() > 0) {
				int len = bis.read(buf);
				bos.write(buf, 0, len);
			}
			bis.close();
			
			bis = new ByteArrayInputStream(data2);
			while (bis.available() > 0) {
				int len = bis.read(buf);
				bos.write(buf, 0, len);
			}
			bis.close();
			
			bis = new ByteArrayInputStream(data3);
			while (bis.available() > 0) {
				int len = bis.read(buf);
				bos.write(buf, 0, len);
			}
			
			byte [] arr = bos.toByteArray();
			
			bos.close();
			bis.close();
			System.out.println(Arrays.toString(arr));
			
		} catch (Exception e) {
		}

	}

}
