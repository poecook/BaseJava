package javademo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteToCharDemo {

	public static void main(String[] args) throws IOException {
		//�ı����ı��ļ�
		//java�ı� char ��16λ�޷������� ���ַ�unicode���루˫�ֽڱ䱿��
		//java�ı��ļ��ǰ���ĳ�ֱ��뷽�����л�Ϊbyte�洢
		//���������
		
		/**
		 * �ַ��Ĵ���һ�δ���һ���ַ�
		 * InputStreamReader ���byte������Ϊchar��
		 * OutStreamWriter char��ת��Ϊbyte�����ձ����ʽ����
		 * 
		 */
		FileInputStream in = new FileInputStream("file.txt");
		InputStreamReader reader = new InputStreamReader(in,"gbk");//Ĭ��ʹ����Ŀ�ı��� ��ȡ�ı��ļ�,�����Ҫ�ļ��ı���
		//FileOutputStream out = new FileOutputStream("file");
		/**
		 * ���ʱ����һ���ֽ�һ���ֽ� �Ŀ���
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
