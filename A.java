package cn.kgc.duixiang;

import java.util.Scanner;

public class A {
	public int num;
	public int v=100;
	public void guess(){
	Scanner sc=	new Scanner(System.in);
	System.out.println("���������µ�����");
	 num=sc.nextInt();
	 if(num>v){
		 System.out.println("�´���");
		 }
	 if(num<v){
		 System.out.println("��С��");
		 }
	 if(num==v){
		 System.out.println("������");
	 }	 
	 	 
	 
	}
}
