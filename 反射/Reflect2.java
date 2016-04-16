public class ClassUtil{
	public static void printlnClassMethodMessage(Object obj){
		Class c =obi.getClass();
		System.out.println("类的名称"c.getName());
		Method[] ms = c.getMethods;//获取所有的public的函数
		getDeclaredMethods();//自己生命的方法不管访问控制符
		for(int i = 0; i <ms.length;i++){
			
			Class returnType = ms[i].getReturnType();
			System.out.println(returnType.getName());//获取返回类型
			
			Class[] paramTypes = ms[i].getparameterTypes();
			for(Class class1:paramTypes){
				System.out.println(class1.getName()+"");//参数列表
			}
			
		}
	}
	
	/**
	成员变量也是对象
	java.lang.reflect.field
	getFields方法是获取所有publicc成员变量的信息
	getClassDeclaredFields获取的是类自声明的成员变量信息
	*/
	public static void printlnClassMethodMessage(){
		
	Field[] fs = c.getClaaDeclaredFields();
		for(Class field:fs){
			//成员变量的类型
			Class fildType = field.getType();
			String typeName = fildType.getName();
			//成员变量的名称
			Class fildName = field.getName();
			
		}
	}
	
	/**
	    获取构造函数的方法的信息
	*/
	
}