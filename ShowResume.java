/*ShowResume.java
 * 2018年12月4日
 * 个人简历信息输出
 * 
 * */
package cn.kcg.test;

public class ShowResume {
	public static void main(String[] args){
		int  age=25;                 //年龄
		String name="小明";           //姓名
		int workTime=3;              //工作时间
		String way="java";           //技术方向
		String favorite="篮球";      //爱好
		String projectCount="5";     //做过的项目数
			System.out.println("这个同学的姓名是"+name);
			System.out.println("年龄是"+age);
			System.out.println("工作时间是"+workTime+"年了");
			System.out.println("爱好是"+favorite);
			System.out.println("技术方向是"+way);
			System.out.println("做过的项目数是"+projectCount+"个项目");
	}
}
