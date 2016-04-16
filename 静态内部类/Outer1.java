

public class Outer1{
	/*
	1,内部类就系那个一个成员一样存在于外部类。
	2、内部类可以访问外部类的所有成员就像访问自己的成员一样没有限制
	3、内部类中的this指的就是实例对象本身如果要用外部类中的实例对象可以用类名this的方式获得
	4、内部类对象不能有成员静态成员，原因是内部类的实例对象是外部实例类对象的一个成员
	5、外部类访问内部类的时候 要先持有内部的对象
	*/
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
