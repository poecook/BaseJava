package javademo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	

	public static void main(String[] args) throws IOException {
	FileOutputStream out = new FileOutputStream("file3");
		
		out.write('A');//д��һ���ڰ�λ��
		out.write(1);
	}
}
