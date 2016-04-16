

public class Outer1{
	private int x = 1;
	public Outer(){
		System.out.println("Outer initial!");
	}
	public void add(){
		System.out.println("get Inner X from Outer+"+new Inner().x);
	}
	public class Inner{
		int x =2;
		public Inner(){
			System.out.println("Inner initial!");
		}
		public void add(){
			
			System.out.println("内部类访问本类的成员变量---"+x);
			System.out.println("内部类访问自己的成员变量--"+this.x);
			System.out.println("内部类访问自己的成员变量--"+Outer.this.x);
		}
	}
	public static void main(String[] args){
		Outer out = new Outer();
		out.add();
		//Inner inner = new Outer().new Inner();
		//inner.add();
	}
}
