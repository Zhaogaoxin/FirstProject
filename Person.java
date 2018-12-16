package cn.kgc.duixiang;

public class Person {
	public String name;
	public int    age;
	JiaoYuan jy=new JiaoYuan();
	public String eat(){
		return"ÄúºÃ";
		
	}
	public int num(){
		return 1;
	}
	public double arr(){
		return 1.3;
	
	}
	public boolean bo(){
		return true;
	}
	public char ca(){
		return 'ÄĞ';
	}
	public byte b(){
		return 0 ;
	}
	public float f(){
		return 2;
	}
	public long l(){
		return 5;
	}
	public static void main(String[] args) {
		JiaoYuan jy=new JiaoYuan();
		Person per=new Person();
		
		System.out.println(per.ca());
		
	}
}
