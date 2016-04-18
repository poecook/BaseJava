package javademo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	

	public static void main(String[] args) throws IOException {
	FileOutputStream out = new FileOutputStream("file3");
		
		out.write('A');//写入一个第八位、
		out.write(1);
	}
}
