class Main{
	 void  system(Office off ){
		off.offstart();
	}
	public static void main(String[] args){
	/**
	一个类只能是一个类的类类型
	类是Class的对象，获取类类型的方法有三种:
	<1> Class main = Main.class;
		Main mainObj = new Main();
	<2> Class main2 =  mainObj.getClass();
	<3> Class c3 = Class.forName("类的全程");
	
	其中Class.forName(),还表示动态加载类也就是运行时刻加载类
	通过类类型创建对象 c.newInstance（）
	*/
	new Main().system(new Word());
		
	}
}