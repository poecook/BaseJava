package javademo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class FileInputStreamDemo {
	
	public static void main(String[] args) throws IOException {
		/**
		 * �ֽ�����
		 * (1)һ���ֽ�һ���ֽڵĶ�
		 * (2)����һ���ֽ���������
		 * (3)
		 */
		
		/**
		 * ������ȡ
		 */
		File file = new File("file.txt");
		File file2 = new File("file2.txt");
		FileOutputStream out = new FileOutputStream(file2);
		if(!file.exists()){
			file.createNewFile();
		}
		java.io.FileInputStream in = new java.io.FileInputStream("file.txt");
		byte[] buff = new byte[1024];
		int i ;	
		i = in.read(buff);
//		while((i= in.read())!=-1){
//			System.out.println(i);
//		}
		System.out.print(new String(buff));
		in.close();
		
		/**
		 * ������ȡ
		 */
		java.io.FileInputStream in2 = new java.io.FileInputStream("file.txt");
	    byte[] bytes = new byte[1024];
	    int j =0;
	    int byteNum= 0;
	    while((byteNum=in2.read(bytes,0,bytes.length))!=-1){//����bytes��������
	    	//ÿ�ζ�������
	    	out.write(bytes) ;
	    	}
	    }

	
}
