package cn.kgc.ifdemo;

import java.util.Scanner;

public class If02 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�����������ܲ��ɼ�");
		int time=input.nextInt();
		System.out.println("�����������Ա�");
		String sex=input.next();
		if(time<10){
			if(sex.equals("��")){
				System.out.println("�����������������");
			
			}else if(sex.equals("Ů")){
				System.out.println("��������Ů�������");
			}else{
				System.out.println("�Բ��������Ա𲻷��ϲ���Ҫ��");
			}
		}else{
			System.out.println("�Բ��𣬳ɼ����ϸ񣬽����˾���");
		}
	
	}

}
