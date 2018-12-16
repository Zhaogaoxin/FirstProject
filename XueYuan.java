package cn.kgc.duixiang;

public class XueYuan {
	public String name;//姓名属性的定义
	public int    age;//年龄属性的定义
	public String hobby;//爱好属性的定义
	public String attend;//班级属性的定义
	public static void main(String[] args) {
		XueYuan zhanghao;
		zhanghao=new XueYuan();
		zhanghao.name="张浩";
		zhanghao.age=10;
		zhanghao.attend="k8505";
		zhanghao.hobby="篮球";
		System.out.println(zhanghao.name+"\n"+"年龄是"+zhanghao.age+"\n"+"爱好："+zhanghao.hobby+"\n"+"班级是："+zhanghao.attend);
	}
	
}
