package cn.kgc.ifdemo;

import java.util.Scanner;

public class If02 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入您的跑步成绩");
		int time=input.nextInt();
		System.out.println("请输入您的性别：");
		String sex=input.next();
		if(time<10){
			if(sex.equals("男")){
				System.out.println("您进入了男子组决赛");
			
			}else if(sex.equals("女")){
				System.out.println("您进入了女子组决赛");
			}else{
				System.out.println("对不起，您的性别不符合参赛要求");
			}
		}else{
			System.out.println("对不起，成绩不合格，进不了决赛");
		}
	
	}

}
