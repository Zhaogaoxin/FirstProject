package cn.kgc.duixiang;

public class Person01 {
	
	public String name;
	public char   sex;
	public double weight;
	public double loseweight;
	public void jf(){
		System.out.println(name+"是一个"+sex+"胖子，体重"+weight+"kg"+"经过"
				+ "不屑努力，减掉了"+loseweight+"kg,"+"减肥后的体重是"+(weight-loseweight)+"kg");
	}
	public String mm(){
		return name;
		
	}
}
