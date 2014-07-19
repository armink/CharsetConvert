package com.armink.convert;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class HEX2UTF8 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String utf8 = null;
		String hexString;
		String[] hexStringArray;
		byte[] hexBytes = new byte[256];
		int index = 0;
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			hexString = scanner.nextLine();
			hexStringArray = hexString.split(" ");
			index = 0 ;
			for (String s : hexStringArray){
				int i = Integer.decode("0x"+s);
				if(i > 128 ) {
					i = 256 - i;
					i = i * -1;
				}
				hexBytes[index] = (byte)i;
				index ++;
			}
			utf8 = new String(hexBytes,"UTF-8");
			System.out.println(utf8);
			hexBytes = new byte[256];
		}
	}
}
