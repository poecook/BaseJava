package javademo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamdemo {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fileout = new FileOutputStream("file3");
		DataOutputStream put = new DataOutputStream(fileout);
		put.write('A');
		put.writeBoolean(true);
		put.writeDouble(9.0);
		
		put.close();
		java.io.FileInputStream filein = new java.io.FileInputStream("file3");
		DataInputStream out = new DataInputStream(filein);
		System.out.println(out.read());
		System.out.println(out.readBoolean());
		System.out.println(	out.readDouble());
	
	}
}
