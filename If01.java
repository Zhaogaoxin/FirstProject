package cn.kgc.ifdemo;
//根据不同学员的成绩，输出不同的评判标准；
public class If01 {
	public static void main(String[] args) {
//		//张浩的Java考试成绩
//		int socre=100;
//		if(socre>90){
//			System.out.println("考得不错，奖励一部iphone6s");
//			
//		}
//		
		int socre=90,music=80;
//		if((socre>90 && music>80) ||( socre==100&&music>70)){
//			System.out.println("考得不错，奖励一台iphone6s");
//		}
	if (socre>90){
			System.out.println("奖励一部iphone6s");
	}else{
		System.out.println("惩罚蹲马步");
	}
	}

}
