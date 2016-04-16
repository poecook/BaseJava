public class EncodeDemo{
	
	public static void main(String[] args){
		String s ="幕课ABC";
		byte[] byte1 =s.getBytes();
		for(byte b:byte1){
			//把字节以16禁止的方式显示
			System.out.println(Integer.toHexString(b&0xff));
		}
	}
}