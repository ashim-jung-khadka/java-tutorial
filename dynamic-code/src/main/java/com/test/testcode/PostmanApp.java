package com.test.testcode;

import com.test.testcode.dynamic.DynaCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class PostmanApp {

	public static void main(String[] args) throws Exception {

		BufferedReader sysIn = new BufferedReader(new InputStreamReader(System.in));

		Postman message = getPostman();

		while (true) {
			System.out.print("Enter a message: ");
			String msg = sysIn.readLine();

			message.deliverMessage(msg);
		}
	}

	public static Postman getPostman() {
		DynaCode dynaCode = new DynaCode();
		dynaCode.addSourceDir(new File("dynacode"));
		return (Postman) dynaCode.newProxyInstance(Postman.class, "com.test.testcode.PostmanImpl");
	}

}
