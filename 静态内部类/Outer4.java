/**
 *��̬�ڲ��ࣺ
 *	1����̬�ڲ��಻���Է����������ⲿ��ķǳ�Ա����
 *	2,�������ڲ��� �����о�̬��Ա ����̬�ڲ�������о�̬��Ա
 *��	3����̬�಻�����������ڵ��ⲿ����� ����ֱ�Ӵ���
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
