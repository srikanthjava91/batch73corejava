package com.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class TestExDemo11 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method strated ");

		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test\\pavan.txt");
		///java.io.IOException: The system cannot find the path specified --> Runime 

		try {
			f.createNewFile();//////Unhandled exception type IOException --> Compiler
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("main method ended ");
	}

}
