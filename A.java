package cn.kgc.duixiang;

import java.util.Scanner;

public class A {
	public int num;
	public int v=100;
	public void guess(){
	Scanner sc=	new Scanner(System.in);
	System.out.println("请输入您猜的数字");
	 num=sc.nextInt();
	 if(num>v){
		 System.out.println("猜大了");
		 }
	 if(num<v){
		 System.out.println("猜小了");
		 }
	 if(num==v){
		 System.out.println("猜中了");
	 }	 
	 	 
	 
	}
}
