import java.io.File;
import java.io.IOException;

/*
 * �����ļ���ʱ�� Ҫ�жϸ��ʼۼд���ô ��������ڴ����ǲ��ɹ���
 * ��Ȼ����Ǵ���Ŀ¼��ʱ������ж��¸�Ŀ¼�治���� ��������� ������Ŀ¼Ȼ���ٴ�����Ŀ¼ Ҳ����ֱ��ʹ��mkdirs
 * 
 * ɾ���ļ����Լ��ļ���������ļ���ʱ��  ʹ�õĵݹ��㷨
 */
public class FileDemo {
	public static void main(String[] args) {
//		File file = new File("E:\\javademo\\java2");
//		if(!file.exists()){
//			System.out.println("�����ɹ���ô��"+file.mkdirs());
//		}else{
//			file.delete();
//		}
		File file2 = new File("E:\\javademo\\java2\\�ռ�.txt");
		if(!file2.exists()){
			try {
				//�ж����ļ����ڲ� ��������ھʹ���
				if(!file2.getParentFile().exists()){
					file2.getParentFile().mkdirs();
				}
				System.out.print("�����ɹ���file2ô"+file2.createNewFile());
				} catch (IOException e) {
					e.printStackTrace();
				}
		}else{
			
			System.out.println(new FileDemo().deteleDir(new File("E:\\javademo"))+"ɾ���ɹ���ô");
		}
	}
	/**
	 * 
	 *���õݹ��㷨��ɾ���ļ��Լ�������ļ���
	 */
	private boolean deteleDir(File dir){
		if(dir.isDirectory()){
			
			String[] children = dir.list();
			for(String fileStr:children){
				System.out.println("--"+fileStr);
				File file = new File(dir,fileStr);
				if(!deteleDir(file))
					return false;
			}
		}
		return dir.delete();
	}
}
