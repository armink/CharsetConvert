package com.armink.convert;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class UTF8ToHEX {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String utf8;
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			utf8 = scanner.nextLine();
			byte[] hex = utf8.getBytes("utf8");
			for (byte b : hex) {
				if (Integer.toHexString(b).length() > 2) {
					System.out.print(Integer.toHexString(b).substring(6, 8)
							.toUpperCase()
							+ " ");
				} else {
					System.out.print(Integer.toHexString(b).toUpperCase() + " ");
				}
			}
		}
	}

}
