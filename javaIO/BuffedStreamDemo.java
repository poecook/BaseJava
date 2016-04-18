package javademo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BuffedStreamDemo {
	/**
	 * BufferedInputStream ��BufferedOutputStream
	 * ���������Ĳ��� һ����ļ����ж�д������ʱ�� �����ϻ��� ������ģʽ�����IO���ܵĲ���
	 * FileOutStream �൱��һ��һ�ε�ת��
	 * BufferedOutputStren �൱���ȷ��뻺���� ��Ͱ�е�������һ������
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
		BufferedOutputStream buffout = new BufferedOutputStream(out);//һ������һ���������Ĵ�С
		
		int c;
		byte[] bytes = new byte[1024];
		while((c=in.read(bytes))!=-1){
			buffout.write(bytes);
			buffout.flush();
		}
	}
		
}
