
public class Outer2 {
	/**
	 * �ֲ��ڲ���
	 * 1.�ֲ��ڲ�����൱��һ���ֲ����� ���÷��ʿ��Ʒ�����,������static���Σ�
	 * 2���ֲ��ڲ��಻��ʹ�ö������ķ����ڲ��ľֲ����� ���Ҫ����Ҫ�ڱ����ʵı���ǰ��final����
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
