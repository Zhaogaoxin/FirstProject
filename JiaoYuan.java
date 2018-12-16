package cn.kgc.duixiang;

public class JiaoYuan {
	
	public String name;//姓名属性 属性的定义： 修饰符 数据类型 变量名[=数据]；
	public int    age;//年龄属性   修饰符  数据类型 变量名[=数据]；
	public String attend;//班级属性  修饰符 数据类型 变量名[=数据]；
	public String hobbby;//爱好属性  修饰符 数据类型 变量名[=数据]；
	public int seniority;//教龄属性 修饰符 数据类型 变量名[=数据]；
	public String professor;//教授属性 修饰符 数据类型 变量名[=数据]；
	public void teach(){//方法（行为，函数）的定义： 修饰符 void 方法名（参数）{}
		System.out.println("教学理念是播撒知识使我快乐");
	}
	public void play(){
		System.out.println("寓教于乐");
	}
	public static void main(String[] args) {
		JiaoYuan wanglaoshi;//对象的声明  类名 对象名；
		wanglaoshi=new JiaoYuan();//对象的创建并赋值给变量  语法：对象名=new 类名（）；
		wanglaoshi.name="王老师";//属性赋值 对象名.属性名=数据
		wanglaoshi.age=25;
		wanglaoshi.attend="k8505";
		wanglaoshi.hobbby="计算机";
		wanglaoshi.professor="使用Java语言理解程序逻辑";
		wanglaoshi.seniority=5;
		System.out.println(wanglaoshi.name+"\n"+"专业方向:"+wanglaoshi.hobbby+"\n"+"教授课程："+wanglaoshi.professor+"\n"+"教龄："+wanglaoshi.seniority);
		wanglaoshi.teach();
		wanglaoshi.play();
		
	}
 
}
