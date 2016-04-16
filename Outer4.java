/**
 *静态内部类：
 *	1，静态内部类不可以访问它所在外部类的非成员变量
 *	2,。正常内部类 不能有静态成员 而静态内部类可以有静态成员
 *·	3、静态类不依附于他所在的外部类对象 可以直接创建
 */
public class Outer4 {
	private int x =8;
	private  static int y = 7;
	static class Inner{
		int i =4;
		static int u=6;
		public void system(){
			System.out.println(new Outer4().x);
			System.out.println(Outer4.y);
		}
	}
	public void get(){
		System.out.println(Inner.u);
		System.out.println(new Inner().i);
		
	}
	
	public static void main(String[] args){
		System.out.println(Outer4.Inner.u);
		Inner in = new Outer4.Inner();
		in.system();
	}
}
