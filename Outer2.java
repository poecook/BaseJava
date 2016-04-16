
public class Outer2 {
	/**
	 * 局部内部类
	 * 1.局部内部类的相当于一个局部变量 能用访问控制符修饰,不能用static修饰，
	 * 2。局部内部类不能使用定义他的方法内部的局部变量 如果要访问要在被访问的变量前加final修饰
	 */
	public void doSomething(){
		final int x = 1;
		
		class Inner{
			int y = 2;
			public void print(){
				System.out.println(y);
				System.out.println(x);
			}
		}
		Inner inner = new Inner();
		inner.print();
	}

	public static void main(String[] args){
		Outer2 out = new Outer2();
		out.doSomething();
	}
}
