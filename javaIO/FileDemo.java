import java.io.File;
import java.io.IOException;

/*
 * 创建文件的时候 要判断父问价夹存在么 如果不存在创建是不成功的
 * 当然如果是创建目录的时候可以判断下父目录存不存在 如果不存在 创建父目录然后再创建子目录 也可以直接使用mkdirs
 * 
 * 删除文件夹以及文件夹下面的文件的时候  使用的递归算法
 */
public class FileDemo {
	public static void main(String[] args) {
//		File file = new File("E:\\javademo\\java2");
//		if(!file.exists()){
//			System.out.println("创建成功了么！"+file.mkdirs());
//		}else{
//			file.delete();
//		}
		File file2 = new File("E:\\javademo\\java2\\日记.txt");
		if(!file2.exists()){
			try {
				//判断下文件存在不 如果不存在就创建
				if(!file2.getParentFile().exists()){
					file2.getParentFile().mkdirs();
				}
				System.out.print("创建成功了file2么"+file2.createNewFile());
				} catch (IOException e) {
					e.printStackTrace();
				}
		}else{
			
			System.out.println(new FileDemo().deteleDir(new File("E:\\javademo"))+"删除成功了么");
		}
	}
	/**
	 * 
	 *利用递归算法，删除文件以及下面的文件夹
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
