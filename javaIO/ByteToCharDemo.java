package javademo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteToCharDemo {

	public static void main(String[] args) throws IOException {
		//文本和文本文件
		//java文本 char 是16位无符号整数 是字符unicode编码（双字节变笨）
		//java文本文件是暗中某种编码方案序列化为byte存储
		//输入输出流
		
		/**
		 * 字符的处理一次处理一个字符
		 * InputStreamReader 完成byte流解析为char流
		 * OutStreamWriter char流转换为byte流按照编码格式处理
		 * 
		 */
		FileInputStream in = new FileInputStream("file.txt");
		InputStreamReader reader = new InputStreamReader(in,"gbk");//默认使用项目的编码 读取文本文件,如果需要文件的编码
		//FileOutputStream out = new FileOutputStream("file");
		/**
		 * 这个时候是一个字节一个字节 的拷贝
		 */
//		int c ;
//		while((c=reader.read())!=-1){
//			System.out.print((char)c);
//		}
		char[] buff = new char[8*1024];
		int c;
		while((c=reader.read(buff))!=-1){
			String s = new String(buff,0,c);
			System.out.print(s);
		}
		reader.close();
	}

}
