package cn.kgc.lei.zulin;

import java.util.Scanner;

//
public class Test {
	public static void main(String[] args) {
		Rent r=  new Rent();
		Scanner  sc=new Scanner(System.in);
		String brand="";
		String type="";
		int seat=0;
		

		do {
			System.out.println("****************��ӭ����С���������޹�˾*******************");
			System.out.println("1���γ� \t 2���ͳ� \t 3����������");
			System.out.println("��ѡ����Ҫ���޵���������");
			int choice=sc.nextInt();
			switch (choice) {//switch��䣻
			case 1:
				System.out.println("������Ʒ�ƣ�1������\t2�����");
				choice=sc.nextInt();
				if(choice==1){//if��䣻
				brand="����";
				System.out.println("�����뱦�����ͣ�1��X6\t2��550i");
				choice =sc.nextInt();	
				type=choice==1?"X6":"550i";//��Ŀ�������
					
					System.out.println("���������޵�����");
					int days=sc.nextInt();
					double money=r.price(days, brand, type, seat);//������Ǯ��
					Vehicle v=r.getCar(brand, type, seat);//��ȡ����������
					String carNumber=v.getCarNumber();//���ݳ������ȡ���ƺ�
					System.out.println("��ѡ��ĳ��ǣ�"+brand+type+";���ƺ���"+carNumber+";���������"+money);
				
				}
				else if(choice==2){
					brand="���";
					System.out.println("�������˳������ͣ�1��������\t2��GL8");
					choice=sc.nextInt();
					type=choice==1?"������":"GL8";
					System.out.println("���������޵�����");
					int days=sc.nextInt();
					double money=r.price(days, brand, type, seat);//������Ǯ��
					Vehicle v=r.getCar(brand, type, seat);//��ȡ����������
					String carNumber=v.getCarNumber();//���ݳ������ȡ���ƺ�
					System.out.println("��ѡ��ĳ��ǣ�"+brand+type+";���ƺ���"+carNumber+";���������"+money);
				}
				break;
			case 2:
				System.out.println("������Ʒ�ƣ�1����\t2������");
				choice=sc.nextInt();
				if(choice==1){
					brand="��";
					System.out.println("������𱭳���λ����1��16\t2��34");
					choice =sc.nextInt();	
					seat=choice==1?16:34;
						System.out.println("���������޵�����");
						int days=sc.nextInt();
						double money=r.price(days, brand, type, seat);//������Ǯ��
						Vehicle v=r.getCar(brand, type, seat);//��ȡ����������
						String carNumber=v.getCarNumber();//���ݳ������ȡ���ƺ�
						System.out.println("��ѡ��ĳ��ǣ�"+brand+";���ƺ���"+carNumber+";���������"+money);
					
					}
				if(choice==2){
					brand="����";
					System.out.println("�������������λ����1��16\t2��34");
					choice =sc.nextInt();	
					seat=choice==1?16:34;
						System.out.println("���������޵�����");
						int days=sc.nextInt();
						double money=r.price(days, brand, type, seat);//������Ǯ��
						Vehicle v=r.getCar(brand, type, seat);//��ȡ����������
						String carNumber=v.getCarNumber();//���ݳ������ȡ���ƺ�
						System.out.println("��ѡ��ĳ��ǣ�"+brand+seat+";���ƺ���"+carNumber+";���������"+money);
					
					}
				break;
			case 3:
				
				return;//return�����ã���������

			default:
				System.out.println("���벻��ȷ������������");
				break;
			}

		
		
		
		
		
		}while(true);
	
	}
}
