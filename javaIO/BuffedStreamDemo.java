package javademo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BuffedStreamDemo {
	/**
	 * BufferedInputStream 和BufferedOutputStream
	 * 带缓冲区的操作 一般打开文件进行读写操作的时候 都加上缓冲 这种流模式提高了IO性能的操作
	 * FileOutStream 相当于一滴一滴的转移
	 * BufferedOutputStren 相当于先放入缓冲区 再桶中导入另外一个缸中
	 * @throws IOException 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		String fromStr,toStr;
		java.io.FileInputStream in = new java.io.FileInputStream("filefrom");
		FileOutputStream out = new FileOutputStream("frileto");
		
		BufferedInputStream buffin = new BufferedInputStream(in);
		BufferedOutputStream buffout = new BufferedOutputStream(out);//一个流和一个缓冲区的大小
		
		int c;
		byte[] bytes = new byte[1024];
		while((c=in.read(bytes))!=-1){
			buffout.write(bytes);
			buffout.flush();
		}
	}
		
}
