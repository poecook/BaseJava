package javademo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterReader {
	/**
	 *字符流的操作
	 * @throws IOException 
	 */

	public static void main(String[] args) throws IOException {
		File file = new File("file.txt");
		FileReader reader = new FileReader(file);//没有直接放编码格式的
		FileWriter writer = new FileWriter("file3");
		char[] chars = new char[1024];
		int n;
		while((n=reader.read(chars))!=-1){
			String s = new String(chars,0,n);
			writer.write(s,0,n);
			writer.flush();
		}
		reader.close();
		writer.close();
		/**
		 * BufferedReader;//读一行
		 * BufferWriter;写一行
		 */
		
		BufferedReader buffReader = new BufferedReader(new FileReader("file2.txt"));
		BufferedWriter buffWriter = new BufferedWriter(new FileWriter("frileto"));
		PrintWriter pw = new PrintWriter("filefrom");
		String line;
		while((line = buffReader.readLine())!=null){
//			buffWriter.write(line);
//			buffWriter.newLine();
//			System.out.println(line);
			
			pw.println(line);
			pw.flush();
		}
		
		
		}

	
}
