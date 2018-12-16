package cn.kgc.duixiang;

public class School {
	public String name;// [修饰符]   数据类型  属性名[=数据]   定义学校姓名属性
	public int  length;// [修饰符]	数据类型    属性名[=数据]   定义学校面积属性
	public String publicticy; 
	public void jiaoxue(){}//[修饰符] 返回类型    方法名（参数类型 参数名）{方法体}  定义对象方法
	
	public static void main(String[] args) {
	School dog;
	dog=new School();
	dog.name="小白";
	dog.length=85;
	dog.publicticy="河南省省级宠物学校";
	System.out.println(dog.name+dog.length);
	}
	
}
