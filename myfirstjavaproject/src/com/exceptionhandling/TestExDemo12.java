package com.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestExDemo12 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("main method strated ");

//		1) Unhandled exception type FileNotFoundException --> when we create object for FileReader.
//		2) C:\Users\srknt\Srikanth Java\test\Srikanth2.txt (The system cannot find the file specified)
		FileReader fr = new FileReader("C:\\Users\\srknt\\Srikanth Java\\test\\Srikanth1.txt");

		// Unhandled exception type IOException
		int i = fr.read();

		while (i != -1) {
			Thread.sleep(200);
			System.out.print((char) i);
			i = fr.read();
		}

		System.out.println((char) i);

		System.out.println("main method ended ");
	}

}
